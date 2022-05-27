package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.controller.form.DevForm;

@Controller
public class DevController {

    @RequestMapping("/input")
    public String index(@ModelAttribute("test") DevForm form, Model model) {
        
    	return "index";
    }
    
    @RequestMapping("/login")
    public String login(@ModelAttribute("test") DevForm form, Model model) {
        
    	return "login";
    }

    @RequestMapping(value="/menu", method=RequestMethod.POST)
    public String post(@ModelAttribute("test") DevForm form, Model model) {
    	String id = form.getId();
    	String pass = form.getPass();
    	
    	if("axiz".equals(id) && "axizuser".equals(pass)) {
    		return "menu";
    	}else {
    		return "login";
    	}
        
    }

}
