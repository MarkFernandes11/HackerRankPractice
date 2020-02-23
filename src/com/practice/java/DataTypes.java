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
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of test cases");
		int testCases = scanner.nextInt();
		int i;
		long number;
		
		for( i=0; i<testCases; i++ ) {
			System.out.println("Enter a number to check in which data type it can fit");			
			try {
				number = scanner.nextLong();
				if( number>=-(long)Math.pow(2, 7) && number<=((long)Math.pow(2, 7)-1) ) System.out.println("* byte");
//				System.out.println(-(long)Math.pow(2, 7)+" = "+((long)Math.pow(2, 7)-1));
				if( number>=-(long)Math.pow(2, 15) && number<=((long)Math.pow(2, 15)-1) ) System.out.println("* short");
//				System.out.println(-(long)Math.pow(2, 15)+"  = "+((long)Math.pow(2, 15)-1));
				if( number>=-(long)Math.pow(2, 31) && number<=((long)Math.pow(2, 31)-1) ) System.out.println("* int");
//				System.out.println(-(long)Math.pow(2, 31)+"  = "+((long)Math.pow(2, 31)-1));
				if( number>=-(long)Math.pow(2, 63) && number<=((long)Math.pow(2, 63)-1) ) System.out.println("* long");
//				System.out.println(-((long)Math.pow(2, 63)+1)+"  = "+(long)Math.pow(2, 63));
			} catch (Exception e) {
				System.out.println("Can't be fitted anywhere");
				break;
			}
		}
		
		scanner.close();
	}

}
