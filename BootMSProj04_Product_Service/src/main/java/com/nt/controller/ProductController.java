package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.enitity.Product;
import com.nt.service.IProductService;

@RestController
@RequestMapping("/product-api")
public class ProductController {

	@Autowired
	private IProductService service;

	@PostMapping("/product")
	ResponseEntity<Product> saveProduct(@RequestBody Product pr) {
		Product p = service.addProduct(pr);
		return new ResponseEntity<Product>(p, HttpStatus.OK);
	}

	@GetMapping("/product")
	ResponseEntity<List<Product>> getAll() {
		List productList = service.getAllProducts();
		return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
	}

	@GetMapping("/product/{id}")
	ResponseEntity<Product> getById(@PathVariable Integer id) {
		Product p = service.getProductById(id);
		return new ResponseEntity<Product>(p, HttpStatus.OK);
	}

	@PutMapping("/product/{id}")
	ResponseEntity<Product> updateProduct(@PathVariable Integer id, @RequestBody Product pr) {
		Product p = service.updateProductById(id, pr);
		return new ResponseEntity<Product>(p, HttpStatus.OK);
	}

	@DeleteMapping("/product/{id}")
	ResponseEntity<String> deleteProductById(@PathVariable Integer id) {
		String message = service.deleteProductById(id);
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}

}
