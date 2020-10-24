package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**/

	public class Main {

		public static void main(String[] args) {
			int n, min, max, maxnumber;

			Scanner in = new Scanner(System.in);

			System.out.println("Enter number of rows and columns:");
			n = in.nextInt();
			int[][] a = new int[n][n];
			min = - n;
			maxnumber = 0;
			max = n;

			for(int i = 0; i<n; i++)
			{
				for(int j = 0; j<n; j++)
				{
					a[i][j] = min - (int)(Math.random())*(max-min+1);
				}
			}
			for (int i = 0; i<n; i++)
			{
				for (int j = 0; j<n; j++)
				{
					if (a[i][maxnumber] < a[i][j]){
						maxnumber = j;

				}
				}
			}

			System.out.println(maxnumber + " Рубаненко В 6.10");
		}
	}
/*не смог закончить задачу*/