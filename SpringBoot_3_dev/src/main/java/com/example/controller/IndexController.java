package com.example.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.controller.form.IndexForm;
import com.example.entity.Product;
import com.example.service.ProductService;

@Controller
public class IndexController {

    @Autowired
    ProductService productService;

    @RequestMapping({ "/", "/index" })
    public String index(@ModelAttribute("index") IndexForm form, Model model) {
        return "top";
    }

    @RequestMapping(value = "/result", params = "search", method = RequestMethod.POST)
    public String search(@ModelAttribute("index") IndexForm form, Model model) {
        ArrayList<Product> productList = new ArrayList<>();
    	productList = productService.search(form.getProductName(), form.getPrice());
    	if(productList == null) {
    		model.addAttribute("msg", "対象のデータはありません");
    		return "top";
    	}else {
    		model.addAttribute("product", productList);
    		return "searchResult";
    	}
    }
    
    @RequestMapping(value = "/result", params = "register", method = RequestMethod.POST)
    public String register(@ModelAttribute("index") IndexForm form, Model model) {
        
    	productService.register(form.getProductName(), form.getPrice());
    	
    	return "insertResult";
    }

}
