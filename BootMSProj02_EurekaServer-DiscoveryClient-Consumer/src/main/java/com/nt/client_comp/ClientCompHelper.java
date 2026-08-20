package com.nt.client_comp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ClientCompHelper {

	@Autowired
	private DiscoveryClient client;

	public String getInfo() {

		List<ServiceInstance> instances = client.getInstances("Producer-info");
		ServiceInstance serviceInstance = instances.get(0);
		String url = serviceInstance.getUri() + "/info/user";
		
		RestTemplate template = new RestTemplate();
		String response = template.getForObject(url, String.class);

		return  response;

	}
}
