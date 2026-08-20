package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class ProducerController {
	
	
	@GetMapping("/user")
	public String getInfor() {
		return "Good mornig sir information about user got retrived";
	}

}
