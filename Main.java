package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**/

	public class Main {

		public static void main(String[] args) {
			String s1 = new String();
			Scanner in = new Scanner(System.in);
			System.out.println("Enter a string");
			s1 = in.nextLine();
			System.out.println(s1);
			StringBuffer text = new StringBuffer(s1);
			int k = s1.length() - s1.replace("(", "").length();
			int m = s1.length() - s1.replace(")", "").length();
			if (m==k){
				for(int i= 0; i < k; i++){
					text.replace(text.indexOf("("), text.indexOf(")")+1, "");
					System.out.println(text);
				}
			}

		}
	}
/**/