package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

/**/

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		int length1 = String.valueOf(a).length();
		int length2 = String.valueOf(b).length();
		int length11 = (int) (Math.log10(a) + 1);
		int length21 = (int) (Math.log10(b) + 1);
		System.out.println("Розряди a " + length1 + " та " + length11 + " Розряди b " + length2 + " та " + length21);
		double result = 2 / (1. / a + 1. / b);
		String formatted = new DecimalFormat("#0.00").format(result);
		System.out.println(formatted);
		System.out.println("Рубаненко В" + " " + "task 1.2");

	}
}
