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
			int k = 1;
			int a1 = 1;
			int a2 = 1;
			int[] arr = new int[10];
			String str = "This is a task worth doing";
			String str2 = "This is a task worth doing";
			char[] str1 = str.replaceAll(" ", "").toCharArray();
			for (int i = 0; i < str.length(); i++) {
				if (str2.indexOf(str1[i]) + str2.lastIndexOf(str1[i]) > k) {
					k = str.substring(str2.indexOf(str1[i]), str2.lastIndexOf(str1[i])).length();
					a1 = str2.indexOf(str1[i]);
					a2 = str2.lastIndexOf(str1[i]);
				}
				System.out.println("The longest substring that meets the criteria is " + str.substring(str2.indexOf(str1[a1]), str2.lastIndexOf(str1[a2])).length());
			}
		}
	}
/*Код не працює повністю, але він майже дороблений*/