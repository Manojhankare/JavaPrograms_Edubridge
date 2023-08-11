package com.assignment;

import java.util.Scanner;

class Employees {
	int empID;
	String empName;
	int empAge;
	double salary;
	Employees() {
		super();
	}

	void inputdetails() {
		System.out.println("Enter Employee id:");
		Scanner sc = new Scanner(System.in);
		empID = sc.nextInt();
		System.out.println("Enter Employee Name: ");
		empName = sc.nextLine();
		sc.nextLine();
		System.out.println(" Enter Employee Age:");
		empAge = sc.nextInt();
		System.out.println("Enter Employee Salary:");
		salary = sc.nextDouble();
		sc.close();
	}
		
	void displayDetails() {
		System.out.println("Emp id =" + empID);
		System.out.println("Emp name=" + empName);
		System.out.println("Emp age =" + empAge );
		System.out.println("Emp salary" + salary);
	}

	
	
@Override
	public String toString() {
		return "Employees [empID=" + empID + ", empName=" + empName + ", empAge=" + empAge + ", salary=" + salary + "]";
	}
}

public class Employee {
	public static void main(String args[]) {
		System.out.println("Main");

		Employees ob = new Employees();
		ob.inputdetails();
		ob.displayDetails();
		
	    Employees ob1 = new Employees();
        ob1.inputdetails();
        ob1.displayDetails();
        System.out.println(ob1);
	}
}

