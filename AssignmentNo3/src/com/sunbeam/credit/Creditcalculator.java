package com.sunbeam.credit;
import java.util.*;

public class Creditcalculator 
{
	private int accNumber;
	private int begBalance;
	private int charges;
	private int creditPaid;
	private int creditLimit;
	
	
	public Creditcalculator(int accNumber, int begBalance, int charges, int creditPaid, int creditLimit)
	{
		
		this.accNumber = accNumber;
		this.begBalance = begBalance;
		this.charges = charges;
		this.creditPaid = creditPaid;
		this.creditLimit = creditLimit;
		
	}

	public int getCreditLimit()
	{
		return creditLimit;
	}
	public void setCreditLimit(int creditLimit) 
	{
		this.creditLimit = creditLimit;
	}

int newBalance()
{
	 int newBalance=0;
	 newBalance=begBalance+charges-creditPaid;
	 return newBalance;
	 
	 
}
     

}
