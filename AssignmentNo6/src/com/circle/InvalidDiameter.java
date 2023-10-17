package com.circle;

public class InvalidDiameter extends Exception
{
	public InvalidDiameter(){
		System.out.println("Diameter shouble be....positive");		
	}	
	public InvalidDiameter(String msg){
	//System.out.println("Diameter shouble be....positive");	
	}
	//@Override
//	public String toString() {
//		return "InvalidDiameter [msg=" + msg + "]";
//	}
}
