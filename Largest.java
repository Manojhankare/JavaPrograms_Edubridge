package com.assignment;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		int a, b, c, d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three numbers to find largest of them:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		sc.close();
		// d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
		int largest = (a > b) ? ((a > c) ? ((a > d) ? a : d) : ((c > d) ? c : d))
				: ((b > c) ? ((b > d) ? b : d) : ((c > d) ? c : d));
		System.out.println("Largest Number:" + largest);
	}
}
