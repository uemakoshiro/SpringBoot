package com.example.com.entity;

public class Product {
	private Integer productId;
	private String productName;
	private Integer price;
	
	public Product() {}
	
	public Product(Integer id, String name, Integer price) {
		this.productId = id;
		this.productName = name;
		this.price = price;
	}
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getProductInfo() {
		return "product_id="+productId+", product_name="+productName+", price="+price;
	}
	
	
}