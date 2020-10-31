package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**/

	public class Main {

		public static void main(String[] args) {
			String[] names = new String[5];
			int[] numbers = new int[5];
			double[] time = new double[5];
			int[] seatnumber = new int[5];

			Train t1 = new Train("Kiev", 10, 12.12, 50, 10, 30, 10);
			names[0] = t1.destination;
			numbers[0] = t1.number;
			time[0] = t1.time;
			seatnumber[0] = t1.number_of_seats;

			Train t2 = new Train("Moscow", 11, 10.45, 40, 10, 20, 10);
			names[1] = t2.destination;
			numbers[1] = t2.number;
			time[1] = t2.time;
			seatnumber[1] = t2.number_of_seats;

			Train t3 = new Train("Kiev", 12, 9.40, 60, 20, 35, 5);
			names[2] = t3.destination;
			numbers[2] = t3.number;
			time[2] = t3.time;
			seatnumber[2] = t3.number_of_seats;

			Train t4 = new Train("Moscow", 13, 14.50, 50, 10, 40, 0);
			names[3] = t4.destination;
			numbers[3] = t4.number;
			time[3] = t4.time;
			seatnumber[3] = t4.number_of_seats;

			Train t5 = new Train("Krakow", 14, 16.00, 40, 25, 0, 15);
			names[4] = t5.destination;
			numbers[4] = t5.number;
			time[4] = t5.time;
			seatnumber[4] = t5.number_of_seats;

			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a destination");
			String targeted_destination = scan.nextLine();
			System.out.println("Please enter the desired time");
			double target_time = scan.nextDouble();
			System.out.println(targeted_destination);
			System.out.println(names[2]);
			for (int i = 1; i < 6; i++) {
				if (names[i - 1].equals(targeted_destination)) {
					System.out.println("//A//");
					System.out.println("Train number " + i + " Has " + targeted_destination + " as a set destination.");
				} else {
					{}
				}


			}
			for (int i = 1; i < 6; i++) {
				if (names[i - 1].equals(targeted_destination) && time[i - 1] > target_time) {
					System.out.println("//B//");
					System.out.println("Train number " + i + " Has " + targeted_destination + " as a set destination and is leaving after " + target_time);
				}
				else {
					{}
				}
			}
			
		}
	}
/**/