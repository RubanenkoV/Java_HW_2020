package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**/

	public class Main {

		public static void main(String[] args) {
			String s1 = "  This is a very complex string with many good features  ";
			String longest = Arrays.stream(s1.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
			System.out.println("a: "+longest);
			int res = s1.split(" +").length;
			System.out.println("б: "+(res-1));
			String replaceAll = s1.replaceAll("(\\s.\\s)|(\\s.$)", " ");
			System.out.println("в" +replaceAll);
			s1 = s1.trim();
			System.out.println("г " +s1);


		}
	}
/**/