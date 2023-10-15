package com.app.fruits;

public class Mango extends fruits
{

public Mango() {
		
	}
	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		//this.taste = taste;
	}

	@Override
	public String toString() {
		return "Mango [" + super.toString() + "]";
	}
	@Override
	public String taste() {
		return "sweet ";
	}
//	@Override
//	public boolean equals(String) {
//		
	//}
	public static void main(String[] args) {
		Mango  Mango = new Mango("Yellow",10,"Mango",true);
		System.out.println(Mango.toString());
		
	}
	
}
