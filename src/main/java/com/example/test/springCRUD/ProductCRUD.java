package com.example.test.springCRUD;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.test.crud.entity.Product;

public interface ProductCRUD extends CrudRepository<Product, String> {
	public Product getById(String id);
	
	public List<Product> getByName(String name);

}
