/******************************************************************************
*  Purpose: To identify in which data types (byte, short, int, long) the number lies
*                        
*  @author  MarkF
*  @date   23-02-2020
*
******************************************************************************/

/******************************************************************************
*
*   Input Format :
*    
*   The first line contains an integer, T, denoting the number of test cases.
*	Each test case, T, is comprised of a single line with an integer, n, which 
*	can be arbitrarily large or small.
*                        
*   Output Format :
*   
*   For each input variable n and appropriate primitive dataType, you must determine
*   if the given primitives are capable of storing it. If yes, then print:
*
******************************************************************************/

package com.practice.java;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of test cases");
		int testCases = scanner.nextInt();
		int i;
		long number;

		for (i = 0; i < testCases; i++) {

			try {
				number = scanner.nextLong();
				System.out.println(number + " can be fitted in:");
				
//				if( number>=-(long)Math.pow(2, 7) && number<=((long)Math.pow(2, 7)-1) ) System.out.println("* byte");
//				System.out.println(-(long)Math.pow(2, 7)+" = "+((long)Math.pow(2, 7)-1));
//				if( number>=-(long)Math.pow(2, 15) && number<=((long)Math.pow(2, 15)-1) ) System.out.println("* short");
//				System.out.println(-(long)Math.pow(2, 15)+"  = "+((long)Math.pow(2, 15)-1));
//				if( number>=-(long)Math.pow(2, 31) && number<=((long)Math.pow(2, 31)-1) ) System.out.println("* int");
//				System.out.println(-(long)Math.pow(2, 31)+"  = "+((long)Math.pow(2, 31)-1));
//				if( number>=-(long)Math.pow(2, 63)-1 && number<=((long)Math.pow(2, 63)) ) System.out.println("* long");
//				System.out.println(-(long)Math.pow(2, 63)-1+"  = "+((long)Math.pow(2, 63)));

				if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE)
					System.out.println("* byte");
				if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE)
					System.out.println("* short");
				if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE)
					System.out.println("* int");
				if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE)
					System.out.println("* long");

				// System.out.println("Byte "+Byte.MIN_VALUE +" "+ Byte.MAX_VALUE);
				// System.out.println("Short "+Short.MIN_VALUE +" "+ Short.MAX_VALUE);
				// System.out.println("Integer "+Integer.MIN_VALUE +" "+ Integer.MAX_VALUE);
				// System.out.println("Long "+Long.MIN_VALUE +" "+ Long.MAX_VALUE);

			} catch (Exception e) {
				System.out.println(scanner.next() + " can't be fitted anywhere.");
			}
		}

		scanner.close();
	}

}
