package com.app.fruits;

public class Apple extends fruits
{

	public Apple() {
		
	}
	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		//this.taste = taste;
	}

	@Override
	public String toString() {
		return "Apple ["+ super.toString() + "]";
	}
	@Override
	public String taste() {
		return "sweet n sour";
	}

	public static void main(String[] args) {
		Apple Apple = new Apple("Red",11,"Apple",true);
		System.out.println(Apple.toString());
		
	}
	
	
}
