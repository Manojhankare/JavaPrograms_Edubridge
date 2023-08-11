package com.assignment;

import java.util.Scanner;

public class vote {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter Your Age: ");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		sc.close();
		if (age >= 18) {
			System.out.println(" You are eligible to Vote!!!");
		} else {
			System.out.println(" Sorry!!! You are not eligible to vote..");
		}
	}
}
