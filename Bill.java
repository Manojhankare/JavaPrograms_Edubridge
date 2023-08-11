package com.assignment;

import java.util.Scanner;

public class Bill {
	
	public static void main(String[] args) {
		int units;
		double charges;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units consumed by user");
		units = sc.nextInt();
		sc.close();
		if (units > 0) {
		if (units <= 200) {
            charges = units * 3.80;
        } 
		else if (units <= 300) {
            charges = (200 * 3.80) + ((units % 200) * 4.40);
        } 
		else if (units <= 400) {
            charges = (200 * 3.80) + (100 * 4.40) + ((units % 300) * 5.10);
        } 
		else {
          
            charges = (200 * 3.80) + (100 * 4.40) + (100 * 5.10) + ((units - 400) * 5.80);
        }
		
		System.out.println("Your total chargeable amount is "+ charges + "rupees");
	}else {
		System.out.println("Enter valid consumed units :");
	}
	}
}
