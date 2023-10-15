package com.app.fruits;
import java.util.*;

public class tester 
{
		public static void main(String[] args) {
			System.out.println("Enter the size of Fruit_basket");
			Scanner sc=new Scanner(System.in);
			int size = sc.nextInt();
			
			fruits []basket=new fruits[size];
			boolean exit = false;
			int choice;
			int index=0;

			
			while(!exit) {
				System.out.println("***************************************************");
				System.out.println("1.Add Apple ");
				System.out.println("2.Add Orange ");
				System.out.println("3.Add Mango ");
				System.out.println("4.Display all fruits ");
				System.out.println("5. Display names of fresh fruits in the basket.");
				System.out.println("6.Display tastes of all stale(not fresh) fruits in the basket.");
				System.out.println("7. Mark a fruit as stale");
				System.out.println("8. Mark all sour fruits stale (optional)");
				System.out.println("100.Exit ");
				System.out.println("Enter your choice");
				choice = sc.nextInt();
				switch(choice) {
				case 1:
					if(index<size) {
						basket[index]=new Apple("Red",11,"Apple",true);	
						System.out.println("Added sucessfully.......");
						index++;
						//break;
					}
									
					else {
						System.out.println("FruitBasket is Full");
					}
					break;
				case 2:
					if(index<size) {
						basket[index]=new Orange("Orange",12,"Orange",true);
						System.out.println("Added sucessfully.......");
						index++;
					}
					
					else {
						System.out.println("FruitBasket is Full");
					}
					break;
				case 3:
					if(index<size) {
						basket[index]=new Mango("Yellow",13,"Mango",true);	
						System.out.println("Added sucessfully.......");
						index++;
					}
					
					else {
						System.out.println("FruitBasket is Full");
					}
					break;
				
				case 4:
					for(fruits f:basket)
						if(f!=null)
						System.out.println(f.toString());
				
				break;
				case 5:
					for(fruits f:basket) {
						if(f !=null && f.isFresh()==true) {
							System.out.println(f.getName());
						}
					}
					break;
				case 6:
					for(fruits f:basket) {
						if(f !=null && f.isFresh()!=true) {
							System.out.println(f.getName()+"="+f.taste());
						}
					}
					break;
				case 7:
					
					System.out.println("Enter a index");
					int ind=sc.nextInt();
	                for(int i=0;i<basket.length;i++)
	                	if(ind==i) {
	                		basket[i].setFresh(false);
	                	}
	                System.out.println("It marks as as Stale");
				
				break;
				case 8:
					for(int i=0;i<basket.length;i++) 
						if(basket[i].taste().equals("sour")) {
						basket[i].setFresh(false);
						System.out.println("sour fruit marks Stale successfully="+basket[i].getName());
						}
						else {
							System.out.println("Not avialble stale fruit");
						}
					
					break;
				case 100:
					exit = true;
					break;
			 default:
					System.out.println("Wrong choice");
					break;
			}
			
		}
			System.out.println("Thanks for purchasing fruits....");
	}
	}


