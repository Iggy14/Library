package com.lms.controller;

import com.lms.model.Book;

public class BookController {
	private Book books[];
	private int bindex;
	public BookController(){
		this.books=new Book[500];
		this.bindex=0;
	}
	public void register(Book b){
		this.books[bindex]=b;
		this.bindex+=1;
	}
	public void update(Book oldB,Book newB){}
	public void brent(Book b){}
	public void breturn(Book b){}
	public void showAll(){
		if(this.bindex==0) System.out.println("\t NO BOOKS");
		else{
			//this code show all book 500
			/*for(Book b:this.books){
				System.out.println(b);
			}*/
			for(int i=0;i<this.bindex;i+=1){
				Book b=this.books[i];
				System.out.println(b);
				System.out.println("-----------");
			}
		}
	}
	

}
