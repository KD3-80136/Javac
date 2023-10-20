package com.sunbeam;
import java.util.*;
public class Main 
{
	public static void calculate(double num1, double num2, Arithmetic op) {
        double result = op.calc(num1, num2);
        System.out.println("Result: " + result);
}

    	public static void main(String[] args) 
    	{
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("________________________________");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) 
            {
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
            } 
            else if (choice == 5)
            {
                break;
            } 
            else 
            {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            switch (choice) 
            {
                case 1:
                    calculate(num1, num2, (a, b) -> a + b); // Addition
                    break;
                case 2:
                    calculate(num1, num2, (a, b) -> a - b); // Subtraction
                    break;
                case 3:
                    calculate(num1, num2, (a, b) -> a * b); // Multiplication
                    break;
                case 4:
                    if (num2 != 0) 
                    {
                        calculate(num1, num2, (a, b) -> a / b); // Division
                    } else 
                    {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
            }
        } while (choice != 5);

        System.out.println("Exiting the program.");
        scanner.close();
    }
}

