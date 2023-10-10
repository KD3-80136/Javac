package com.sunbeaminfo.date;
import java.util.*;

public class Date 
{
	int day;
	int month;
	int year;
	
	Date()
	{
		this.day=0;
		this.month=0;
		this.year=0;
	}
	
	Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public int getday()
	{
		return day;
	}
	
	public void setday(int day)
	{
		this.day=day;
	}
	
	public int getmonth()
	{
		return month;
	}
	
	public void setmonth(int month)
	{
		this.month=month;
	}
	
	public int getyear()
	{
		return year;
	}
	
	public void setyear(int year)
	{
		this.year=year;
	}
	
	public void acceptdate()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a day:");
		this.day=sc.nextInt();
		System.out.println("Enter a month:");
		this.month=sc.nextInt();
		System.out.println("Enter a year:");
		this.year=sc.nextInt();
		
		}
	public void displaydate()
	{
//		System.out.println("Day:"+this.day);
//		System.out.println("month:"+this.month);
//		System.out.println("year:"+this.year);
		System.out.println(this.day+"/"+this.month+"/"+this.year);
	}
	
	
}
