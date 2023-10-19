package com.book;

import java.util.Objects;
import java.util.Scanner;

public class Book 
{
	private String isbn;
	private double price;
	private String	authorName;
	private int quantity;
	public Book() {
		this("",0,"",0);
	}
	
	public Book(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
public void accept() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter isbn");
	this.isbn=sc.next();
	System.out.println("Enter price");
	this.price=sc.nextInt();
	System.out.println("Enter authorName");
	this.authorName=sc.next();
	System.out.println("Enter quantity");
	this.quantity=sc.nextInt();
}
public void display() {
	
	System.out.println("isbn = "+this.isbn);

	System.out.println(" price = "+this.price);

	System.out.println("authorName = "+this.authorName);

	System.out.println("quantity = "+this.quantity);

}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(authorName, isbn, price, quantity);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		return Objects.equals(isbn, other.isbn);
//				
	
	
	public int hashCode() 
	{
		int hash = Objects.hash(this.isbn);
		return hash;
	}
	
	public boolean equals(Object obj) 
	{
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(obj instanceof Book) 
		{
			Book other = (Book) obj;
			if(this.isbn == other.isbn)
				return true;
		}
		return false;
	}

	}
	

