package com.book;
import java.util.*;
public class Test 
{
	public static void main(String[] args) {
		class BookComparator implements Comparator<Book>
		{

			@Override
			public int compare(Book b1, Book b2) {
				int diff=Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
			}
			
		}
		BookComparator bookComp=new BookComparator();
		
	TreeSet<Book>set=new TreeSet<Book>(bookComp);
    set.add(new Book("H5",89.0,"JK Rolling",2));
    set.add(new Book("H2",35.0,"John keats",3));
    set.add(new Book("H2",55.0,"Chetan",4));
    set.add(new Book("H4",100.0,"Amish",1));
    set.add(new Book("H1",50.0,"Durjoy",5));
   
    System.out.println("Display all books in Forward Order......");
    Iterator<Book>itr=set.iterator();
    while(itr.hasNext())
    {
    	Book b=itr.next();
    	System.out.println(b);
    }
    System.out.println("-------------------------------------------------------\n");	
    System.out.println("Display all books in Reverse Order......");
    Iterator<Book>itr1=set.descendingIterator();
    while(itr1.hasNext())
    {
    	Book str=itr1.next();
    	System.out.println(str);
    }	
    
	}

}
