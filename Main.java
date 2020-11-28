package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**/

	public class Main {

		public static void main(String[] args) throws FileNotFoundException {
			String s1 = "18abshe123dhh";
			String[] s2 = s1.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
			for (int i = 0; i < 4; i++) {
				System.out.println(s2[i]);

			}
			int k = Integer.parseInt(s2[0]);
			if (k % 9 == 0) {
				System.out.println("The condition for task A is met");
			} else {
				System.out.println("The condition for task a is not met");
			}
			System.out.println(s2.length);
			String s11 = s1.replace(s2[0], "");
			System.out.println(s11);
			if (s2.length == 2 && s11.length == Integer.parseInt(s2[0])) {
				System.out.println("The Condition for Task Б is met");
			}

		}
	}


/**/