package com.example.test.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.ErrorStatus;
import com.example.test.crud.entity.Product;
import com.example.test.services.ProductService;

@RestController("/products")
public class ProductEndpoints {
	
	@Autowired
	private ProductService productServiceImpl;
	
	@GetMapping("/id")
	@ResponseBody
	public <T> ResponseEntity<? extends T> getProductById(@RequestParam(name ="productId") String id) {
		
		if(productServiceImpl.getProductById(id) == null) {
			return new ErrorStatus("Product not found", HttpStatus.NOT_FOUND.toString());
					
		}
		else {
			return productServiceImpl.getProductById(id);
		}
	
	}

}
