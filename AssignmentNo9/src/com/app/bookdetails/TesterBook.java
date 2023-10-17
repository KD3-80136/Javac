package com.app.bookdetails;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class TesterBook
{
public static void main(String[] args) {
		
		List<Book> list = new ArrayList<Book>();
		list.add(new Book("a", 100, "Rutuja", 16));
		list.add(new Book("c", 60, "Bhumika", 10));
		list.add(new Book("b", 10, "Chaitrali", 15));
	
		
		boolean exit = false;
		int choice;
		while (!exit) {
			System.out.println("***********************************");
			System.out.println("0.Exit");
			System.out.println("1.Add new book in list");
			System.out.println("2.Display all books in forward order.");
			System.out.println("3.Delete at book given index -- list.remove(index)");
			System.out.println("4. Check if book with given isbn is in list or not");
			System.out.println("5. Delete all books in list");
			System.out.println("6. Display number of books in list");
			System.out.println("7. Sort all books by price in desc order -- list.sort();");
			System.out.println("***********************************");
			choice = new Scanner(System.in).nextInt();
			switch (choice) {
			case 1:
				Book b = new Book();
				b.accept();
				list.add(b);
				System.out.println("Added SuccessFUlly............");
				break;
			case 2:

				for (Book book : list) {
					System.out.println(book);
				}
				break;
			case 3:
				System.out.println("Enter a index");
				int index = new Scanner(System.in).nextInt();
				for (int i = 0; i < list.size(); i++) {
					if (index == i)
						list.remove(i);
				}
				System.out.println("Removed....Sucessfully");
				break;
			case 4:
				Book b1 = new Book();

				System.out.println("Enter isbn");
				String key = new Scanner(System.in).next();
				b1.setIsbn(key);

				if (list.contains(b1))
					System.out.println("Is present");
				else
					System.out.println("Is not present");
				break;

			case 5:
				list.clear();
				System.out.println("Cleared Successfully...");
				break;
			case 6:
				System.out.println("No of books avilable = " + list.size());

//				list.size();

			case 7:
				class SortBooks implements Comparator<Book> {
					public int compare(Book b1, Book b2) {
						int diff = b1.getQuantity() - b2.getQuantity();
						return diff;
					}
				}
				list.sort(new SortBooks());
				System.out.println("After sort");
				for (Book book : list) {

					System.out.println(book);
				}
				break;

			case 100:
				exit = true;
				break;

			default:
				break;
			}

		}
		System.out.println("Thanks for using list....please come again..)");
	}
}
