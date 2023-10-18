package com.app.book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class TestBook
{

	public static void main(String[] args)
	{

		List<Book> list = new ArrayList<Book>();
		list.add(new Book("a", 100, "Rutuja", 16));
		list.add(new Book("c", 60, "Bhumika", 10));
		list.add(new Book("b", 10, "chaitu", 15));
		Book b;
		int indx ;
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int choice;
		while (!exit) {
			System.out.println("*************");
			System.out.println("100.Exit");
			System.out
					.println("Add new book in List\n" + "If book not present, then add a new book (hint - contains())\n"
							+ "If book is present, increment its quantity.");
			System.out.println("2. Display all books in forward order using random access");
			System.out.println("3.Search a book with given isbn (hint - indexOf()))");
			System.out.println("4. Delete a book at given index.");
			System.out.println("5. Delete a book with given isbn.");
			System.out.println("6. Reverse the list (hint - Collections.reverseList()");

			System.out.println("*************");
			choice = new Scanner(System.in).nextInt();
			switch (choice) {
			case 1:

				Book b1 = new Book();
				b1.accept();
				if (list.contains(b1)) {
					int index = list.indexOf(b1);
					b = list.get(index);
					b.setQuantity(b.getQuantity() + 1);

				} else {

					list.add(b1);
				}
				System.out.println("Added SuccessFUlly............");
				break;
			case 2:

				for (int i = 0; i < list.size(); i++) {
					b = list.get(i);
					System.out.println(b);
				}
				break;

			case 3:
				System.out.println("Enter a new book isbn");
				String isbn = sc.next();
				Book b2 = new Book();
				b2.setIsbn(isbn);
				 indx = list.indexOf(b2);
				if (indx== -1) {
					System.out.println("Book is not found...");
				} else {
					b = list.get(indx);
					System.out.println(b);
				}

				break;
			case 4:
				System.out.println("Enter a index");
				int index = sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
					if (index == i)
						list.remove(i);
				}
				System.out.println("Removed....Sucessfully");

				break;

			case 5:
				System.out.println("Enter a isbn");
				String bn = sc.next();
				Book b3 = new Book();
				b3.setIsbn(bn);
				int i = list.indexOf(b3);
				list.remove(i);
				System.out.println("Removed Successfully....");
				break;
			case 6:
				Collections.reverse(list);
				System.out.println("Reveresed List: " + list);
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

