package com.lms.util;

import com.lms.model.Category;

public class DataUtil {
	
	public Category[] getAllCategories(){
		//Category cat[]=new Category[10];
		Category cat[]={
				new Category("Comic","CMC"),
				new Category("Comedy","CMD"),
				new Category("Action","ACT"),
				new Category("Horry","HOR"),
				new Category("Programming Language","PL"),
				new Category("Database ","DB")
		};
		
		return cat;
	}

}
