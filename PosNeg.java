package com.assignment;

import java.util.Scanner;

public class PosNeg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		sc.close();

		if (number > 0) {
			System.out.println("The given number is positive.");
		} else if (number < 0) {
			System.out.println("The given number is negative.");
		} else {
			System.out.println("The given number is zero.");
		}
	}
}
