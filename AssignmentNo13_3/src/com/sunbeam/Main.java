package com.sunbeam;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main
{
	 public static void main(String[] args) 
	 {
	        try (Scanner sc = new Scanner(System.in);
	             BufferedWriter bwr = new BufferedWriter(new FileWriter("output.txt"))) 
	        {

	            for (int i = 1; i <= 4; i++) 
	            {
	                System.out.print("Enter line " + i + ": ");
	                String line = sc.nextLine();
	                bwr.write(line);
	                bwr.newLine(); // Add a new line after each input line
	            }

	            System.out.println("Lines have been written to the file successfullyyyyyyyyy.");

	        } catch (IOException e)
	        {
	            System.err.println("Error: " + e.getMessage());
	        }
	    }
}
