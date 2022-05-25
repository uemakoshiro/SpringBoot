package com.example.com.dao;

import java.util.List;

import com.example.com.entity.Product;

public interface ProductDao {

    public List<Product> findAll();

}