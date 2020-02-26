/******************************************************************************
*  Purpose: To find the area of the parallelogram using a static block to 
*  			initialize the variables.
*                        
*  @author  MarkF
*  @date   25-02-2020
*
******************************************************************************/


/******************************************************************************
*
*   Input Format :
*    
*   There are two lines of input. The first line contains B: the breadth of the parallelogram.
*   The next line contains H: the height of the parallelogram.
*   
*   Constraints :
*   
*   -100 <= B <= 100
*   -100 <= H <= 100
*                        
*   Output Format :
*   
*   If both values are greater than zero, then the main method must output the area of the parallelogram.
*   Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
*
******************************************************************************/

package com.practice.java;

import java.util.Scanner;

public class StaticInitializerBlock {
	
	static Scanner scanner = new Scanner(System.in);
	static int breath;
	static int height;
	static boolean flag;
	
	static {
		breath = scanner.nextInt(); 
		height = scanner.nextInt();
		flag = (breath>0 && height>0) ? true : false; 
	}
	
	public static void main(String[] args) {
		if(flag) {
			System.out.println(breath*height);
		} else {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		
		scanner.close();
	}

}
