package com.company;
import javax.print.DocFlavor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


/**/

	public class Main {

		public static void main(String[] args)  {
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			ArrayList<Integer> list2 = new ArrayList();
			ArrayList<Integer> list3 = new ArrayList();
			list1.add(21);
			list1.add(3);
			list1.add(11);
			list1.add(10);
			list1.add(41);
			list1.add(5);
			//System.out.println(list1.get(1));
			int k = 0;
			for(int i= 0; i < list1.size()-1; i+=2){
				k += list1.get(i) + list1.get(i+1);
				list2.add(k);
				k = 0;
				//if(i == list1.size() - 2){
					//list2.add(list1.get(i));
				//}
			}
			//System.out.println(list2);
			for(int i= 0; i < list2.size()-1; i+=2) {
				k += list2.get(i) + list2.get(i + 1);
				list3.add(k);
				k = 0;
				//if(i == list2.size() - 1){
				//list3.add(list2.get(i));
				//}
				list3.add(list2.get(list2.size()-1));
			}
			//System.out.println(list3);
			//System.out.println(list2.get(2));
			int sum = 0;
			for(int j = 0; j < list3.size(); j++)
				sum += list3.get(j);
			System.out.println(sum);

		}
	}


/**/