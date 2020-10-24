package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**/

	public class Main {

		public static void main(String[] args) {
			int [] numbers = new int[10];
			numbers[0] = 123;
			numbers[1] = 32;
			numbers[2] = 12;
			numbers[3] = 834;
			numbers[4] = 44;
			numbers[5] = 31;
			numbers[6] = 90;
			numbers[7] = 844;
			numbers[8] = 1;
			numbers[9] = 900;
			for(int i = 0; i < numbers.length; i++){
				if (numbers[i] - 10 <= 0){
					{}

				}
				else if (numbers[i] < 100){
					if (numbers[i] % 10 == ((numbers[i] - numbers[i] % 10)/10) + 1){
						System.out.println(numbers[i]);
					}
					else{
						{}
					}
				}
				else{
					if (numbers[i] % 10 == ((numbers[i] % 100 - numbers[i] %10)/10) + 1 && ((numbers[i] - numbers[i] % 100) / 100 == numbers[i]% 10 - 2)){
						System.out.println(numbers[i]);
					}
					else{
						{}
					}
				}
			}
			System.out.println("Рубаненко В task5.7");

		}
	}
	/*Задача работает для чисел от 0 до 999*/
