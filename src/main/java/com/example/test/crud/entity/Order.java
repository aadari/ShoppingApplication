package com.example.test.crud.entity;

import java.util.List;

public class Order {
   private List<Product> products;

public List<Product> getProducts() {
	return products;
}

public void setProducts(List<Product> products) {
	this.products = products;
}
   
}
