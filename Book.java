package com.lms.model;

public class Book {
	private String isbn;
	private String title;
	private int pubYear;
	private int noOfPages;
	private int edition;
	private Author authors[];
	private Category category;

	@Override
	public String toString() {
		String result= "\nISBN  ="+this.isbn+
				"\nTitlte ="+this.title+
				"\nPublish Year ="+this.pubYear+
				"\nNO of Pages ="+this.noOfPages+
				"\nEdition ="+this.edition;
		
		for(Author a:this.authors)
			result+="\n"+a.toString();
		
		result+="\n"+this.category.toString();
		return result;
	
	}
	public Book() {
		super();
	}
	public Book(String isbn, String title, int pubYear, int noOfPages, int edition, Author[] authors,
			Category category) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.pubYear = pubYear;
		this.noOfPages = noOfPages;
		this.edition = edition;
		this.authors = authors;
		this.category = category;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPubYear() {
		return pubYear;
	}
	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public Author[] getAuthors() {
		return authors;
	}
	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	

}
