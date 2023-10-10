package com.sunbeam.credit;

public class limitCalculatorTest 
{

	public static void main(String[] args) 
	{
//public Creditcalculator(int accNumber, int begBalance, int charges, int creditPaid, int creditLimit)
		Creditcalculator c=new Creditcalculator (23,1000,200,500,2000);
		int newBalance=c.newBalance();
		if(newBalance<=c.getCreditLimit())
		{
			System.out.println("new balance="+newBalance);
			
		}
		else
		{
			System.out.println("Credit limit Exceeded...");
		}
		

	}

}
