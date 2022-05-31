package com.example.service;

import java.util.ArrayList;

import com.example.entity.Product;

public interface ProductService {

    public ArrayList<Product> search(String name, String price);
    
    public int register(String name, String price);

}
