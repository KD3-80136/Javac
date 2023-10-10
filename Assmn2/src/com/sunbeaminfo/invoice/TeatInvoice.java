package com.sunbeaminfo.invoice;

public class TeatInvoice {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Invoice i1 = new Invoice();
//		i.acceptInvoice();
//		i.displayInvoice();
//		i.calculateAmount();
		Invoice i=new Invoice("101","abc",10,1.2);
		i.displayData();
		System.out.println("Calculate Amount="+i.calculateAmount());


	}

}
