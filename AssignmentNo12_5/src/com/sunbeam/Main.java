package com.sunbeam;

public class Main 
{
		static <T> int countIf(T[] arr, T key, Check<T> c)
		{
	        int count = 0;
	        for (T element : arr)
	        {
	            if (c.compare(element, key)) 
	            {
	                count++;
	            }
	        }
	        return count;
	    }
		
		public static void main(String[] args) 
		 {
		        Double[] arr = {4.3, 7.7, 9.9, 2.2, 5.5, 6.6,6.6};
		        Double key = 6.6;

		        int cnt = countIf(arr, key, (x, y) -> x > y);
		        System.out.println("Count = " + cnt); 
		    }
}
