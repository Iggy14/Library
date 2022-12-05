package com.lms.model;

public class Category {
	private String catName;
	private String catCode;
	
	
	
	
	@Override
	public String toString() {
		return "Category:"+this.catName+","+this.catCode;
	}
	public Category() {
		super();
	}
	public Category(String catName, String catCode) {
		super();
		this.catName = catName;
		this.catCode = catCode;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCatCode() {
		return catCode;
	}
	public void setCatCode(String catCode) {
		this.catCode = catCode;
	}
	

}
