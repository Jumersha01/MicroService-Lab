package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
public class BootMsProj03EurekaServerFeignClientProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj03EurekaServerFeignClientProducerApplication.class, args);
	}

}
