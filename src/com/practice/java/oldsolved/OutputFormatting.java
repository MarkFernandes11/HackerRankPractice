/******************************************************************************
*  Purpose: To test the understanding of formatting output using printf.
*                        
*  @author  MarkF
*  @date   23-02-2020
*
******************************************************************************/


/******************************************************************************
*
*   Input Format :
*    
*   Every line of input will contain a String followed by an integer.
* 	Each String will have a maximum of 10 alphabetic characters, and
*   each integer will be in the inclusive range from 0 to 999.
*                        
*   Output Format :
*   
*   In each line of output there should be two columns:
*	The first column contains the String and is left justified using exactly 15 characters.
*	The second column contains the integer, expressed in exactly 3 digits; if the original
*	input has less than three digits, you must pad your output's leading digits with zeroes.
*	
*	================================
*	java           100 
*	cpp            065 
*	python         050 
*	================================
*
******************************************************************************/


package com.practice.java.oldsolved;

import java.util.Scanner;

public class OutputFormatting {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int i;
		
		System.out.println("================================");
		for(i=0; i<3; i++) {
			String string = scanner.next();
			int number = scanner.nextInt();
			
			// %s for string, 15 for total length and '-' to inverse direction of padding 
			// by default it is left padding with spaces.
			System.out.printf("%-15s", string);
			
			// %d for int, 3 for providing length and '0' for padding.
			System.out.printf("%03d", number);
			
			System.out.println();
			
		}
		System.out.println("================================");
		
		scanner.close();
	}

}
