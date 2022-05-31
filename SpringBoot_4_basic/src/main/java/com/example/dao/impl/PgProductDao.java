package com.example.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.dao.ProductDao;
import com.example.entity.Product;

@Repository
public class PgProductDao implements ProductDao {

    private static final String SEARCH = "SELECT * FROM products ";
    private static final String REGISTER = "INSERT INTO products(product_name, price) VALUES(:name, :price)";

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public ArrayList<Product> search(String name, String price) {
        String sql = SEARCH;
        MapSqlParameterSource param = new MapSqlParameterSource();
        
        if(!name.isEmpty() || !price.isEmpty()){
        	sql += "WHERE ";
        	if(!name.isEmpty()) {
        		sql += "product_name = :name ";
                param.addValue("name", name);
        		if(!price.isEmpty()) {
        			sql += "AND ";
        		}
        	}if(!price.isEmpty()) {
        		sql += "price = :price ";
                param.addValue("price", Integer.parseInt(price));
        	}
        }sql += "ORDER BY product_id";
        
        List<Product> resultList = jdbcTemplate.query(sql, param, new BeanPropertyRowMapper<Product>(Product.class));

        return resultList.isEmpty() ? null : (ArrayList<Product>) resultList;
    }
    
    public int register(String name, String price) {
    	Integer priceInt = null;
    	String sql = REGISTER;
        MapSqlParameterSource param = new MapSqlParameterSource();
        param.addValue("name", name);
        if(!"".equals(price)){
        	priceInt = Integer.parseInt(price);
        }
        param.addValue("price", priceInt);
    	return jdbcTemplate.update(sql, param);
    }

}

