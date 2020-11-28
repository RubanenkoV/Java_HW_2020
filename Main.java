package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**/

	public class Main {

		public static void main(String[] args) {
			Account_1 a1 = new Account_1("Edward", "Riggs", 25, 2, 2000, 100);
			Account_1 a2 = new Account_1("Edward", "Riggs", 25, 2, 1000, 50);
			a1.current();
			a2.current();
			a1.Block();
			a1.Unlock();
			a1.transfer();
			a2.Unlock();

		}
	}
/**/