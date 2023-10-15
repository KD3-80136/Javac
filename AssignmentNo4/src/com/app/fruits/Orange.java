package com.app.fruits;

public class Orange extends fruits
{

public Orange()
	{
		
	}
	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		//this.taste = taste;
	}

	@Override
	public String toString() {
		return "Orange ["+super.toString() + "]";
	}
	@Override
	public String taste() {
		return "sour ";
	}
	public static void main(String[] args) {
		Orange  Orange = new Orange("Orange",12,"Orange",true);
		System.out.println(Orange.toString());
		
	}	

	
}
