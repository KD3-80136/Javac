package com.app.fruits;
import java.util.*;
public class fruits 
{
	private String color;
	private double weight;
	private String name;
	private boolean isFresh=true;
	

	public fruits() {
		this("",0,"",false);
	}

	public fruits(String color, double weight, String name, boolean isFresh) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public String taste() {
		return "no specific taste";
	}

	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	
	
}
