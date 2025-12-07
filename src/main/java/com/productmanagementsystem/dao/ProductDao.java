package com.productmanagementsystem.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.productmanagementsystem.entity.Product;
import com.productmanagementsystem.repo.ProductJpaRepository;

@Repository
public class ProductDao {

	@Autowired
	private ProductJpaRepository jpaRepository;
	
	public Product addProduct(Product p) {
		return jpaRepository.save(p);
	}
}
