package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client_comp.ClientCompHelper;

@RestController
@RequestMapping("/consumer-api")
public class ConsumerController {
	@Autowired
	private ClientCompHelper helper;
	
	@GetMapping("/data")
	public String getMessage() {
	   String	res = helper.getInfo();
	   
	   return res;
	   
	}

}
