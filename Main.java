package com.company;

import java.util.Scanner;

/*Программа пишет дату*/

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int month = in.nextInt();
		int day = in.nextInt();
		int year = in.nextInt();
	    if (0 < month && month < 13 && 0 < day && day < 32 && 1999 < year && year < 2101);{
	    	if (month == 1) {
				System.out.println(day + " " + "сiчня" + " " + year);
			}
	    		else if (month == 2){
					System.out.println(day + " " + "лютого" + " " + year);

				}
	    		else if (month == 3){
					System.out.println(day + " " + "березня" + " " + year);

				}
	    		else if (month == 4){
					System.out.println(day + " " + "квiтня" + " " + year);

				}
	    		else if (month == 5){
					System.out.println(day + " " + "травня" + " " + year);

				}
	    		else if (month == 6){
					System.out.println(day + " " + "червня" + " " + year);

				}
	    		else if (month == 7){
					System.out.println(day + " " + "липня" + " " + year);

				}
	    		else if (month == 8){
					System.out.println(day + " " + "серпня" + " " + year);

				}
	    		else if (month == 9){
					System.out.println(day + " " + "вересня" + " " + year);

				}
	    		else if (month == 10){
					System.out.println(day + " " + "жовтня" + " " + year);

				}
	    		else if (month == 11){
					System.out.println(day + " " + "листопада" + " " + year);

				}
	    		else if (month == 12){
					System.out.println(day + " " + "грудня" + " " + year);

				}
	    	else{
				System.out.println("Please enter a correct date");
			}
		}
	    System.out.println("Рубаненко В.П. 16.09.2020, 14:56");
		System.out.println("task 1.7");


		}
}
