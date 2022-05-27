package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.controller.form.BasicForm;
import com.example.entity.Product;

@Controller
public class BasicController {

    @RequestMapping("/input")
    public String index(@ModelAttribute("test") BasicForm form, Model model) {
        
    	List<Product> productList = new ArrayList<>();
    	productList.add(new Product(101,"鉛筆",50));
    	productList.add(new Product(102,"消しゴム",100));

        // プルダウンの内容をmodelにセット
        model.addAttribute("productList", productList);
    	
    	return "index";
    }

    @RequestMapping(value="/result", method=RequestMethod.POST)
    public String post(@ModelAttribute("test") BasicForm form, Model model) {
    	String name = form.getName();
    	int id = form.getProduct();
    	
    	Product product = null;
    	switch (id) {
        case 101:
        	product = new Product(101,"鉛筆",50);
            break;
        case 102:
        	product = new Product(102,"消しゴム",100);
            break;
        }

    	model.addAttribute("name", name);
        model.addAttribute("pd", product);

        return "result";
    }

}
