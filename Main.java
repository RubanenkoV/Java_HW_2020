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
			Scanner in = new Scanner(System.in);
			String A = in.nextLine();
			String s = A.replace(".", "...");
			String s1 = s.replace("!", ".");
			String s2 = s1.replace("*", "+");
			System.out.println(s2);

		}
	}


/**/