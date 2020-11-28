package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**/

	public class Main {

		public static void main(String[] args) {
			Tax_1 t1 = new Tax_1(10, 15, 20);
			Tax_2 t2 = new Tax_2(25, 20, 40);
			t1.sum_of_taxes();
			t2.sum_of_taxes();
			t1.sort_of_taxes();
			t2.sort_of_taxes();

			Scanner n = new Scanner(System.in);
			int tax1_test = n.nextInt();
			int tax2_test = n.nextInt();
			int tax3_test = n.nextInt();

			if (tax1_test == t1.tax1 && tax2_test == t1.tax2 && tax3_test == t1.tax3) {
				System.out.println("The input is equal to Tax1");
			} else if (tax1_test == t2.tax1 && tax2_test == t2.tax2 && tax3_test == t2.tax3) {
				System.out.println("The input is equal to Tax2");

			}
		}
	}
/**/