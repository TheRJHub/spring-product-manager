package com.productmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productmanagementsystem.entity.Product;
import com.productmanagementsystem.service.ProductService;
import com.productmanagementsystem.util.ResponseStructure;

@RestController
/**
 * Creating Rest api
 */
public class ProductController {
  
	@Autowired
	private ProductService service;
	
	@PostMapping("/save")
	public  ResponseEntity<ResponseStructure<Product>> create(@RequestBody Product p) {
		return service.addProduct(p);
	}
}
