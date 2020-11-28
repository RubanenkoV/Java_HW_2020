package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**/

	public class Main {

		public static void main(String[] args) {
			Day d = new Day(16, 40);
			d.PrintTime();
			d.SetDay(24, 15, 23);
			d.PrintTime();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
			LocalDateTime now = LocalDateTime.now();
			System.out.println(dtf.format(now));
		}
	}
/**/