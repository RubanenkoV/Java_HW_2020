package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

/**/

	public class Main {

		static int calculateFactorial(int n){
			int result = 1;
			for (int i = 1; i <= n; i ++){
				result = result*i;
			}
			return result;
		}

		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int number = in.nextInt();
			if (number > 0) {
				System.out.println(calculateFactorial(number));
			}
			else{
				System.out.println("Please enter a N integer");
			}
			System.out.println("Рубанкеко В. task 4.1");
		}
	}