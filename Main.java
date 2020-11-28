package com.company;
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

		public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
			int n = 10, j = 0, k = 0;
			PrintWriter H = new PrintWriter("the-file-name.txt", "UTF-8");
			PrintWriter G = new PrintWriter("the-file-name.txt", "UTF-8");
			Scanner s = new Scanner(System.in);
			File file = new File("/Users/user/Desktop/file.txt");
			Scanner s1 = new Scanner(file);
			int my_arr[] = new int[n];
			int odd_vals[] = new int[n];
			int even_vals[] = new int[n];
			for(int i = 0; i < n; i++){
				my_arr[i] = s1.nextInt();
			}
			for(int i = 0; i < n; i++){
				if(my_arr[i] % 2 != 0){
					odd_vals[j] = my_arr[i];
					j++;
				} else {
					even_vals[k] = my_arr[i];
					k++;
				}
			}
			System.out.print("The odd numbers in the array : ");
			if(j > 1){
				for(int i = 0;i < (j-1); i++){
					System.out.print(odd_vals[i]+",");
					H.println(odd_vals[i]);
				}
				System.out.print(odd_vals[j-1]);
			} else {
				System.out.println("There are no odd numbers.");
			}
			System.out.println("");
			if(k > 1){
				for(int i = 0; i < (k-1); i++){
					if(even_vals[i]!=1){
						System.out.print(even_vals[i]+",");
						G.println(even_vals[i]);
				}
				System.out.print(even_vals[k-1]);
			} else {
				System.out.println("There are no even numbers in the array.");
			}
		}
		}
	}


/**/