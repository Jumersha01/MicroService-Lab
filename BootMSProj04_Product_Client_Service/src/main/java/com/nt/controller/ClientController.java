package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client_comp.FeignClientComp;
import com.nt.model.Product;

@RestController
@RequestMapping("/clients")

public class ClientController {

	@Autowired
	private FeignClientComp feignClient;
	
	@PostMapping("/products")
	ResponseEntity<Product> saveProduct(@RequestBody Product pr){
		return feignClient.saveProduct(pr);
	}
	
	@GetMapping("/products")
	ResponseEntity<List<Product>> getAllProduct(){
		return feignClient.getAllPrduct();
	}
	
	@GetMapping("/products/{id}")
	ResponseEntity<Product> getById(@PathVariable Integer id){
		return feignClient.getProductsById(id);
	}
	
	@PutMapping("/products/{id}")
	ResponseEntity<Product> updateProduct(@PathVariable Integer id,@RequestBody Product pr){
		return feignClient.updateProduct(id, pr);
	}
	
	@DeleteMapping("/products/{id}")
	ResponseEntity<String> deleteProduct(@PathVariable Integer id){
		return feignClient.deleteProduct(id);
	}
}
