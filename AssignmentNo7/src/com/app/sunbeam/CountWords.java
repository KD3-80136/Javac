package com.app.sunbeam;
import java.util.Scanner;

public class CountWords 
{
	public static void main(String[] args) {
		System.out.println("Enter a String = ");
		String s = new Scanner(System.in).nextLine();

	int count=0;
	String[]words = s.split(" ");
	count=words.length;
	System.out.println("Words count = "+count);
	for(String arr:words)
		System.out.println(arr);

	}
}
