package com.sunbeam;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class sum
{
	public static void main(String[] args) 
	{
		IntStream s= IntStream.range(1, 10);
		int sum=s.sum();
		System.out.println(sum);
		IntStream s1=IntStream.range(1, 10);//1 include and 10 exclude
		System.out.println(s1.summaryStatistics());

	}
}
