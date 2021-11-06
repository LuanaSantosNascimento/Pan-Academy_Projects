package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.table.Products;

public interface ProductRepository extends JpaRepository<Products, Long>{

}
