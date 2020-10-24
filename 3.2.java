package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

/**/

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, d;
		double y1, y2;
		double x1, x2, x3, x4;
		System.out.println("Введите а: ");
		a = in.nextDouble();
		System.out.println("Введите b: ");
		b = in.nextDouble();
		System.out.println("Введите c: ");
		c = in.nextDouble();
		d = Math.pow(b, 2) - (4 * a * c);
		if (d > 0){
			y1 = ((-1) * b + Math.sqrt(d)) / 2 * a;
			y2 = ((-1) * b - Math.sqrt(d)) / 2 * a;
			if (y1 > 0){
				x1 = Math.sqrt(y1);
				x2 = - Math.sqrt(y1);
			}
			else{
				x1 = 999;
				x2 = 999;
				System.out.println("x1 и x2 принадлежат пустому множеству");

			}
			if (y2 > 0){
				x3 = Math.sqrt(y2);
				x4 = - Math.sqrt(y2);
			}
			else{
				x3 = 999;
				x4 = 999;
				System.out.println("x3 и x4 принадлежат пустому множеству");

			}
			System.out.println("x1 = " + x1 + " x2 = " + x2 + " x3 = " + x3 + " x4 = " + x4);
		}
		else if (d == 0){
			x1 = (-1) * b;
			System.out.printf("x1, x2 = " + x1);
		}
		else
			System.out.print("Ошибка. D меньше нуля");
	}
}
/*Я не знал как присвоить x1 x2 x3 x4 значения пустого множества в случаях, когда их не существует, поэтому присвоил большие значения, но в консоль
все равно выводится сообщение об этом
 */