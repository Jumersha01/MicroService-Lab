package com.nt.client_comp;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nt.model.Product;

@FeignClient(name="Product-Service")
public interface FeignClientComp {

	@PostMapping("/product-api/product")
	ResponseEntity<Product> saveProduct(@RequestBody Product pr);
	
	@GetMapping("/product-api/product")
	ResponseEntity<List<Product>> getAllPrduct();
	
	@GetMapping("/product-api/product/{id}")
	ResponseEntity<Product> getProductsById(@PathVariable Integer id);
	
	@PutMapping("/product-api/product/{id}")
	ResponseEntity<Product> updateProduct(@PathVariable Integer id,@RequestBody Product pr);
	
	@DeleteMapping("/product-api/product/{id}")
	ResponseEntity<String> deleteProduct(@PathVariable Integer id);
	
}
