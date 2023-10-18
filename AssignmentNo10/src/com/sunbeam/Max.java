package com.sunbeam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Max 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
//        strings.add("Rutuja");
//        strings.add("Bhumika");
//        strings.add("Chaitrali");
//        strings.add("Surabhi");
//        strings.add("Sammed");
        Collections.addAll(list,"Rutuja","Chaitrali","Bhumika","Surabhi");

        // Find the string with the highest length using Collections.max()
        //String longestString = Collections.max(strings, (s1, s2) -> s1.length() - s2.length());
        CustomComparator comparator=new CustomComparator();
        String str=Collections.max(list,comparator);
        System.out.println("max string:"+str);
        // Output the longest string
        //System.out.println("String with the highest length: " + longestString);
    
	 }
	}

