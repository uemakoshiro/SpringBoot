package com.example.controller;

import java.util.ArrayList;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.controller.form.IndexForm;
import com.example.entity.Product;
import com.example.service.ProductService;

@Controller
public class IndexController {

	@Autowired
    MessageSource messageSource;
	
	//String errMsg = messageSource.getMessage("select.error",null,Locale.getDefault());
	
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
    		String errMsg = messageSource.getMessage("select.error", null, Locale.getDefault());
    		model.addAttribute("msg", errMsg);
    		return "top";
    	}else {
    		model.addAttribute("product", productList);
    		return "searchResult";
    	}
    }
    
    @RequestMapping(value = "/result", params = "register", method = RequestMethod.POST)
    public String register(@Validated @ModelAttribute("index") IndexForm form, BindingResult bindingResult, Model model) {
    	
    	if(bindingResult.hasErrors()) {
    		return "top";
    	}
    	
    	productService.register(form.getProductName(), form.getPrice());
    	
    	return "insertResult";
    }

}
