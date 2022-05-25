package com.example.com.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.com.dao.ProductDao;
import com.example.com.entity.Product;

@Repository
public class PgProductDao implements ProductDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Product> findAll() {
        return jdbcTemplate.query("SELECT * FROM products ORDER BY product_id",
            new BeanPropertyRowMapper<Product>(Product.class));
    }
}
