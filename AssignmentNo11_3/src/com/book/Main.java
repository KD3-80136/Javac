package com.book;
import java.util.*;

public class Main 
{
	
	public static void main(String[] args) 
	{
	Set<Book>set=new TreeSet<Book>();
	set.add(new Book("R1",23.4,"Rutuja",2));
	set.add(new Book("R3",24.3,"Bhumika",1));
	set.add(new Book("R2",23.4,"Chaitrali",3));
	set.add(new Book("R6",26.2,"Surbhi",4));
	set.add(new Book("R1",27.6,"Sammed",5));
	
	Iterator <Book>itr=set.iterator();
	while(itr.hasNext())
	{
		Book b=itr.next();
		System.out.println(b);
	}

	

}
}
