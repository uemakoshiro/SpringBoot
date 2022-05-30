package com.example.dao;

import java.util.ArrayList;

import com.example.entity.Product;

public interface ProductDao {

    public ArrayList<Product> search(String name, String price);
    
    public int register(String name, String price);

}

