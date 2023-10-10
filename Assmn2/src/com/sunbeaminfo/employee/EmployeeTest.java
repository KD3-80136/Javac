package com.sunbeaminfo.employee;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee e1 =new Employee();
//      e1.acceptEmployee();
//      e1.displayEmployee();
//      System.out.println("Increment_salary = "+e1.increSalary());
      Employee e2 =new Employee("Rutuja","Hatgine",12000);
  
      e2.displayEmployee();
      System.out.println("Increment_salary = "+e2.increSalary());
	}

}
