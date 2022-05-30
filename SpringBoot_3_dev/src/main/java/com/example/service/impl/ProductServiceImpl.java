package com.example.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProductDao;
import com.example.entity.Product;
import com.example.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    public ArrayList<Product> search(String name, String price) {
        return productDao.search(name, price);
    }
    
    public int register(String name, String price) {
    	return productDao.register(name, price);
    }
}

