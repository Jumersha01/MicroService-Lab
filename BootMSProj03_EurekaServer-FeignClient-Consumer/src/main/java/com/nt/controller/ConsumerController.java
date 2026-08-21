package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client_comp.IFeignClientComponent;

@RestController
public class ConsumerController {
	
	@Autowired
	private IFeignClientComponent feingClients;
	
    @GetMapping("/data/{name}")
    ResponseEntity<String> gettingMessage(@PathVariable String name){
    return 	 feingClients.retriveMessage(name);
   
	  
  }
}
