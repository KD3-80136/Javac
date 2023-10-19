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
    set.add(new Book("R5",89.0,"Rutuja",2));
    set.add(new Book("R2",35.0,"Bhumika",3));
    set.add(new Book("R2",55.0,"Chaitrali",4));
    set.add(new Book("R4",100.0,"Sammed",1));
    set.add(new Book("R1",50.0,"Akash",5));
   
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
