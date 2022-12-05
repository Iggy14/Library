package com.lms.view;

import java.util.Scanner;
import com.lms.controller.BookController;
import com.lms.model.Author;
import com.lms.model.Book;
import com.lms.model.Category;
import com.lms.util.DataUtil;
import com.lms.util.ValidationUtil;

public class LmsView {
	private Scanner scan;
	private BookController bookCtrl;
	
	public LmsView(){
		this.scan=new Scanner(System.in);
		this.bookCtrl=new BookController();
	}
	public void  mainMenu(){
		int choice;
		do{
			System.out.println("###Libraray Management System###");
			System.out.println("1)Register Book");
			System.out.println("2)Update Book");
			System.out.println("3)Show All Book");
			System.out.println("4)Rent Book");
			System.out.println("5)Return Book");
			System.out.println("6)Exit");
			System.out.print("Enter your choice:");
			choice=this.scan.nextInt();this.scan.nextLine();
			switch(choice){
				case 1:this.registerBook();break;
				case 2:this.updateBook();break;
				case 3:this.showAllBook();break;
				case 4:this.rentBook();break;
				case 5:this.returnBook();break;
			}
		}while(choice!=6);
	}
	public void  registerBook(){
		ValidationUtil vutil=new ValidationUtil();
		System.out.println("\t###NEW BOOK FORM####");
		String strIsbn;
		boolean res=false;
		do{
			System.out.print("\tEnter Book isbn:");
			strIsbn=this.scan.nextLine();
			res=vutil.checkReqiure(strIsbn);
			if(res) System.out.println("\t<<<<<Your Isbn is empty>>>>>>");
			else{
				res=vutil.checkLength(strIsbn, 10, 13);
				if(res) System.out.println(
						"<<<<<<Your Isbn is betweemn 10 and 13 characters>>>>>>");
			}
		}while(res);
		
		
		System.out.print("\tEnter Book title:");
		String strITitle=this.scan.nextLine();
		
		System.out.print("\tEnter Book pub Year:");
		int pubYear=this.scan.nextInt();this.scan.nextLine();
		
		System.out.print("\tEnter Book no of Pages:");
		int noOfPages=this.scan.nextInt();this.scan.nextLine();
		
		System.out.print("\tEnter Book  edition:");
		int bookEdt=this.scan.nextInt();this.scan.nextLine();
		
		System.out.println("");
		Author tmp[]=new Author[5];
		int aindex=0;
		char cont='n';
		do{
			System.out.print("\tEnter Author Name:");
			String strAname=this.scan.nextLine();
			System.out.print("\tEnter Author Email:");
			String strAemail=this.scan.nextLine();
			tmp[aindex]=new Author(strAname,strAemail);
			aindex+=1;
			System.out.print("\tDo u have another autohor:");
			cont=this.scan.nextLine().toUpperCase().charAt(0);
		}while(cont=='Y');
		
		Author authors[]=new Author[aindex];
		for(int i=0;i<aindex;i+=1)
			authors[i]=tmp[i];
		
		System.out.println("");
		System.out.println("\tSelect Your book category");
		DataUtil dataUtil=new DataUtil();
		Category cats[]=dataUtil.getAllCategories();
		for(int i=0;i<cats.length;i+=1){
			Category c=cats[i];
			System.out.println("\t("+(i+1)+")"+c.getCatName()+"_"+c.getCatCode());
		}
		System.out.print("\tEnter your book category:");
		int cno=this.scan.nextInt();this.scan.nextLine();
		Category cat=cats[cno-1];
		
		Book b=new Book(strIsbn,strITitle,pubYear,noOfPages,bookEdt,authors,cat);
		this.bookCtrl.register(b);
		
	}
	public void  updateBook(){}
	public void  showAllBook(){
		this.bookCtrl.showAll();
	}
	public void  rentBook(){}
	public void  returnBook(){}

}

