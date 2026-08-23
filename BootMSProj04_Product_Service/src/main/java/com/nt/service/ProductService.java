package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.enitity.Product;
import com.nt.repository.IProductRepository;

@Service
public class ProductService implements IProductService {

	@Autowired
	private IProductRepository repo;
	
	
	@Override
	public Product addProduct(Product pr) {
		
		return repo.save(pr);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return repo.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		
		return repo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid id"));
	}

	@Override
	public Product updateProductById(Integer id, Product pr) {
		Optional<Product> container = repo.findById(id);
		Product p = null;
		if(container.isPresent()) {
			p=container.get();
			p.setName(pr.getName());
			p.setPrice(pr.getPrice());
			p.setQuantity(pr.getQuantity());
			
			return repo.save(p);
		}
		
		return null;
	}

	@Override
	public String deleteProductById(Integer id) {
		Optional<Product> container = repo.findById(id);
		String message = null;
		if(container.isPresent()) {
			repo.delete(container.get());
			message = "Product is Deleted with id: "+id;
		}
		
		return message;
	}

}
