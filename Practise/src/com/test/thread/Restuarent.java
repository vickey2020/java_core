package com.test.thread;

import java.sql.Time;
import java.util.Scanner;



public class Restuarent
{
	public static void main(String[] args) {

		int capacity = 30;
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("please enter 1 to book seats");
			System.out.println("Please enter 2 to free seats");
			System.out.println("Please enter 3 to check availability");
			System.out.println("Please enter one of the option");

			int option = scanner.nextInt();

			switch(option){
			case 1:
				System.out.println("Please enter number of seats");

				int numberOfSeats = scanner.nextInt();

				if(numberOfSeats <= capacity){
					System.out.println("Successfully Reserved " + numberOfSeats + " seats");
					capacity-=numberOfSeats;
				}
				else{
					System.out.println("No enough seats available ... Please wait");
				}
				break;
				
			case 2:
				System.out.println("Please enter number of seats to free");

				int freeNumberOfSeats = scanner.nextInt();

				if(freeNumberOfSeats > 0 && capacity+freeNumberOfSeats <= 30){
					System.out.println("Successfully freed " + freeNumberOfSeats + " seats");
					capacity+=freeNumberOfSeats;
				}
				else{
					System.out.println("Please enter valid seats");
				}
				break;
			
			case 3:
				System.out.println("Total number of seats available : " + capacity);
				break;
			}
		}

	}

}

