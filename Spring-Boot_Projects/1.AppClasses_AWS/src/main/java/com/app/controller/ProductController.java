package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.repository.ProductRepository;
import com.app.table.Products;

@RestController
@CrossOrigin("*")
public class ProductController 
{
	//Testando os 'Endpoints'
    @GetMapping("/stringReturn")
    public String method(){
        return "Hello World !\n Your request has been completed.";
    }

    @GetMapping("/numberReturn")
    public int idade(){
        return 1;
    }

    @Autowired
    private ProductRepository repository;

    @GetMapping("/products")
    public List<Products> getAll() {
        return repository.findAll();
    }
}