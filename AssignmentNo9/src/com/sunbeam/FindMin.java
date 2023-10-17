package com.sunbeam;

public class FindMin
{
	static <T extends Number> T FindMin(T[] arr)
	{
		T min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min.doubleValue()>arr[i].doubleValue())
				min=arr[i];
		}
		return min;
	}
	
}



