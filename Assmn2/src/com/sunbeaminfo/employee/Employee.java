package com.sunbeaminfo.employee;
import java.util.*;
public class Employee 
{
	String firstName;
	String lastName;
	double salary;
	public Employee() {
		this("","",0);
	}
	public Employee(String firstName, String lastName, double salary) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void acceptEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a firstName=");
		this.firstName=sc.next();
		System.out.println("Enter a lastName=");
		this.lastName=sc.next();
		System.out.println("Enter a salary=");
		this.salary=sc.nextDouble();
	}
	public void displayEmployee() {

		System.out.println("firstName="+this.firstName);

		System.out.println("lastName="+this.lastName);

		System.out.println("Yearly salary="+this.salary*12);
		
	}
	public double increSalary() {
		
		return (this.salary*12)*0.1+this.salary*12;
	}
		
}
