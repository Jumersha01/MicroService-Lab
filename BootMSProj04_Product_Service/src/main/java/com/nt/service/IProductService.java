package com.nt.service;

import java.util.List;

import com.nt.enitity.Product;

public interface IProductService {

	Product addProduct(Product pr);

	List<Product> getAllProducts();

	Product getProductById(Integer id);

	Product updateProductById(Integer id, Product pr);

	String deleteProductById(Integer id);

}
