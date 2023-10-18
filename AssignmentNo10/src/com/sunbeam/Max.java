package com.sunbeam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Max 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
        Collections.addAll(list,"Rutuja","Chaitrali","Bhumika","Surabhi");

        
        CustomComparator comparator=new CustomComparator();
        String str=Collections.max(list,comparator);
        System.out.println("max string:"+str);
    
	 }
	}

