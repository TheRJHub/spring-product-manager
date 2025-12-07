package com.productmanagementsystem.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.productmanagementsystem.dao.ProductDao;
import com.productmanagementsystem.entity.Product;
import com.productmanagementsystem.util.ResponseStructure;

@Service
public class ProductService {

	@Autowired
	private ProductDao dao;
	
	public  ResponseEntity<ResponseStructure<Product>> addProduct(Product p) {
		dao.addProduct(p);
		ResponseStructure<Product> rs = new ResponseStructure<Product>(); 
		rs.setData(p);
		rs.setMessage("Added");
		rs.setDate(LocalDateTime.now());
		rs.setStatusCode(HttpStatus.ACCEPTED.value());
		return new ResponseEntity<ResponseStructure<Product>>(rs, HttpStatus.ACCEPTED);
	}
}
