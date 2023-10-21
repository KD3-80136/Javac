package com.sunbeam;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;



public class Main 
{
	public static void main(String[] args) 
	{
        
        String filePath = "/home/sunbeam/java_practicde/AssignmentNo13_3/output.txt";

        try {
            
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
