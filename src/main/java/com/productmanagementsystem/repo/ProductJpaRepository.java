package com.productmanagementsystem.repo;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.productmanagementsystem.entity.Product;

public interface ProductJpaRepository extends JpaRepository<Product, Integer>{

}
