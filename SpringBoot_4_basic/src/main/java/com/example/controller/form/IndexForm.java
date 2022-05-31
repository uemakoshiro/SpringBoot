package com.example.controller.form;

import javax.validation.constraints.NotBlank;

public class IndexForm {
	
	@NotBlank
    private String productName;
	@NotBlank
    private String price;
    
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
    
	
    

}

