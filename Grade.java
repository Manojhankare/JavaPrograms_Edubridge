package com.assignment;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		int marks;
		String grade;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks: ");
		marks = sc.nextInt();
		sc.close();

		if (marks >= 90 && marks <= 100) {
			grade = "A";
		} else if (marks >= 70 && marks <= 89) {
			grade = "B";
		} else if (marks >= 50 && marks <= 69) {
			grade = "C";
		} else if (marks >= 0 && marks <= 49) {
			grade = "D";
		} else {
			grade = "Invalid";
		}
		System.out.println("Your grade: " + grade);
	}
}
