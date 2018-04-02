package com.example.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.test.crud.entity.Product;
import com.example.test.springCRUD.ProductCRUD;

public class ProductService {

	@Autowired
	ProductCRUD productCRUD;
	
	public Product getProductById(String id) {
		return productCRUD.getById(id);
	}
	
	public List<Product> getProductsByName(String name){
		return productCRUD.getByName(name);
	}
}
