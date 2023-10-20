package com.sunbeam;
import java.util.*;
import java.util.stream.Stream;
public class Sum 
{

	public static void main(String[] args) {
		Random r=new Random();
		Stream<Integer>strm=Stream.generate(()->r.nextInt(10)).limit(10);
		
		int res=strm.reduce(0,(a,e)->(a+e));
		
		
		System.out.println("sum of 10 random numbers  is: "+res);
}
}