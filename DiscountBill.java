package com.assignment;

import java.util.Scanner;

public class DiscountBill {
	String pname;
	float price;
	float discount;
	float discountPrice;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product name:");
		pname = sc.nextLine();

		System.out.print("Enter the price: ");
		price = sc.nextFloat();

		sc.close();
	}

	void calculate() {
		
		if (price > 0 && price <= 10000) {
			System.out.println();
			discount = price * 0.05f;
		} else if (price > 1000 && price <= 20000) {
			discount = price * 0.10f;
		} else if (price > 20000 && price <= 35000) {
			discount = price * 0.15f;
		} else {
			discount = price * 0.20f;
		}
		discountPrice = price - discount;
		}
	void displaydata() {

		System.out.println(" Product Name : " + pname);
		System.out.println(" Product Price : Rs." + price);
		System.out.println("Discounted Price: Rs." + discountPrice);
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to Application");
		DiscountBill dob = new DiscountBill();
		dob.input();
		dob.calculate();
		dob.displaydata();

	}
}