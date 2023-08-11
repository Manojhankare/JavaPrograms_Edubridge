package com.assignment;

import java.util.Scanner;

public class DiscountBill1 {
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
	if (price > 0 && price <= 1000) {
		discount = price * 0.02f;
	} else if (price > 1000 && price <= 3000) {
		discount = price * 0.10f;
	} else {
		discount = price * 0.15f;
	}

	discountPrice = price - discount;
	}
	void displaydata() {

	System.out.println("Your Product Name : " + pname);
	System.out.println("Your Product Price : Rs." + price);
	System.out.println("Discounted Price: Rs." + discountPrice);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Application");
		DiscountBill1 dob = new DiscountBill1();
		dob.input();
		dob.calculate();
		dob.displaydata();

		
	}
}
