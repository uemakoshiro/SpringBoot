package com.example.com;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.com.entity.Product;
import com.example.com.service.ProductService;

@SpringBootApplication
public class SpringBoot1BasicApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
            SpringApplication.run(SpringBoot1BasicApplication.class, args);

        ProductService productService = context.getBean(ProductService.class);
        List<Product> list = productService.findAll();
        System.out.println("【products】");
        for (Product u : list) {
            System.out.println(u.getProductInfo());
        }
    }

}

