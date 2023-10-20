package com.count;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class Lengthh 
{
	
		public static int countIf(List<String> list, Predicate<String> cond)
		{
	        int count = 0;
	        for(String str: list) 
	        {
	            if(cond.test(str))
	                count++;
	        }
	        return count;
	    }

	    public static void main(String[] args) 
	    {
	        List<String> list1 = new ArrayList<>();
	        Collections.addAll(list1, "Rutuja", "Bhumika", "Chaitrali", "Surbhi", "Sammed", "Akash");

	        
	        Stream<String> strm1 = list1.stream();
	        strm1.filter(ele -> ele.length() > 6).forEach(ele -> System.out.println(ele));

	        // Count the number of elements with length > 6 using countIf() method
	        int cnt = countIf(list1, s -> s.length() > 6);
	        System.out.println("Number Of Count: " + cnt);
	    }
}
