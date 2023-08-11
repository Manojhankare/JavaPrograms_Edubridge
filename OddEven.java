package com.assignment;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		sc.close();

		if (number % 2 == 0) {
			System.out.println("The given number is even.");
		} else {
			System.out.println("The given number is odd.");
		}
	}
}
