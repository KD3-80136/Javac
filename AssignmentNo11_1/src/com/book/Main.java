package com.book;
import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Set<Book>set=new HashSet<Book>();
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
		
// Output:-     Book [isbn=R1, price=23.4, authorName=Rutuja, quantity=2]
//				Book [isbn=R2, price=23.4, authorName=Chaitrali, quantity=3]
//				Book [isbn=R3, price=24.3, authorName=Bhumika, quantity=1]
//				Book [isbn=R6, price=26.2, authorName=Surbhi, quantity=4]
//				Book [isbn=R1, price=27.6, authorName=Sammed, quantity=5]

//Solution for Duplicate:-
		
//		public int hashCode() 
//		{
//			int hash = Objects.hash(this.isbn);
//			return hash;
//		}
//		
//		public boolean equals(Object obj) 
//		{
//			if(obj == null)
//				return false;
//			if(this == obj)
//				return true;
//			if(obj instanceof Book) 
//			{
//				Book other = (Book) obj;
//				if(this.isbn == other.isbn)
//					return true;
//			}
//			return false;
//		}

//   Output:-   Book [isbn=R3, price=24.3, authorName=Bhumika, quantity=1]
//		        Book [isbn=R6, price=26.2, authorName=Surbhi, quantity=4]
//				Book [isbn=R1, price=23.4, authorName=Rutuja, quantity=2]
//				Book [isbn=R2, price=23.4, authorName=Chaitrali, quantity=3]
		
	}
}
