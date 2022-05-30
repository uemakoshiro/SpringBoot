package com.example.controller;

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

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String result(@ModelAttribute("index") IndexForm form, Model model) {
        
    	Product product = productService.findById(form.getId());
    	if(product == null) {
    		model.addAttribute("msg", "対象のデータはありません");
    		return "top";
    	}else {
    		model.addAttribute("product", product);
    		return "searchResult";
    	}
    }

}
