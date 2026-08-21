package com.nt.controller;

import java.time.LocalTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-api")
public class FeignClientController {
	
	@GetMapping("/message/{name}")
	ResponseEntity<String> getMessage(@PathVariable("name") String customerName){
		
	   LocalTime time = LocalTime.now();
	   int hours = time.getHour();
	    String result = (hours>=12&&hours<=17)?"Good After Noon":(hours>=17&&hours<=20)?"Good Evenenig":(hours<=11&&hours>=5)?"Good Morining":"Good Night";
	    return new ResponseEntity<String>(result+" "+customerName,HttpStatus.OK);
	}

}
