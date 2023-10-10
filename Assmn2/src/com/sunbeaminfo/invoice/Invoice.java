package com.sunbeaminfo.invoice;
import java.util.*;
public class Invoice 
{
	String PartNumber;
	String partDescription;
	int quantity;
	double price;
	
	Invoice()
	{
		this.PartNumber="";
		this.partDescription="";
		this.quantity=0;
		this.price=0;
		
		//this("","",0,0);
	}
	
	Invoice(String PartNumber,String partDescription,int quantity,double price)
	{
		this.PartNumber=PartNumber;
		this.partDescription=partDescription;
		this.quantity=quantity;
		this.price=price;
	}
	
	public String getpartnum()
	{
		return PartNumber;
	}
	
	public void setpartnum(String PartNumber)
	{
		this.PartNumber=PartNumber;
	}
	
	public String getpartdesc()
	{
		return partDescription;
	}
	
	public void setpartdesc(String partDescription)
	{
		this.partDescription=partDescription;
	}
	
	public int getquantity()
	{
		return quantity;
	}
	
	public void setquantity(int quantity)
	{
		if(this.quantity>0)
			this.quantity=quantity;
			else
				this.quantity=0;
		
	}
	
	public double getprice()
	{
		return price;
	}
	
	public void setprice(double price)
	{
		if(this.price>0)
		this.price=price;
		else
			this.price=0;
	}
	
	public void acceptData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Part Number:");
		this.PartNumber=sc.next();
		System.out.println("Enter Part Description:");
		this.partDescription=sc.next();
		System.out.println("Enter Quantity:");
		this.quantity=sc.nextInt();
		System.out.println("Enter Price:");
		this.price=sc.nextDouble();
		
	}
	public void displayData()
	{
		System.out.println("Part Number:"+this.PartNumber);
		System.out.println("Part Description:"+this.partDescription);
		System.out.println("quantity:"+this.quantity);
		System.out.println("Price:"+this.price);
		
		
	}
	double calculateAmount() {
		double amount = quantity * price;
		return amount;
	}
}
