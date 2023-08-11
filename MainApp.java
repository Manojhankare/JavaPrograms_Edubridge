package com.assignment;

import java.util.Scanner;

class Students {
	int studentid;
	String studentname;
	int studentage;
	Students() {
		// TODO Auto-generated method stub
		super();

	}

	void inputdetails() {
		System.out.println("Enter student id:");
		Scanner sc = new Scanner(System.in);
		studentid = sc.nextInt();
		System.out.println("Enter Student Name: ");
		studentname = sc.nextLine();
		sc.nextLine();
		System.out.println(" Enter student Age:");
		studentage = sc.nextInt();
		sc.close();
	}
		
	void displayStudentsDetails() {
		System.out.println("Student id =" + studentid);
		System.out.println("Student name=" + studentname);
		System.out.println("Student age =" + studentage);
	}

	@Override
	public String toString() {
		return "Students [studentid=" + studentid + ", studentname=" + studentname + ", studentage=" + studentage + "]";
	}
}


public class MainApp {
	public static void main(String args[]) {
		System.out.println("Main");

		Students sob = new Students();
		sob.inputdetails();
		sob.displayStudentsDetails();
		
	    Students sob1 = new Students();
        sob1.inputdetails();
        sob1.displayStudentsDetails();
        System.out.println(sob1);
	}
}