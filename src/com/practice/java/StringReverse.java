/******************************************************************************
*  Purpose: To find if the given string is palindrome or not.  			
*                        
*  @author  MarkF
*  @date   29-02-2020
*
******************************************************************************/


/******************************************************************************
*
*   Input Format :
*    
*   Any String with lowercase english letters
*
*	Constraints :
*
*	String will consist at most 50 lower case english letters.
*                        
*	Output Format :
*   
*   Return Yes if it is a palindrome, print No otherwise.
*
******************************************************************************/


package com.practice.java;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to check if it is palindrome");
		String string = scanner.next();
		
		String reverseString = getReverseString(string);
		
		if(string.equals(reverseString)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		scanner.close();
	}

	private static String getReverseString(String string) {

		String reverseString = "";
		
		if(string.length() != 0) {
			for(int i=(string.length()-1); i>=0; i--) {
				reverseString += string.charAt(i);
			}
		}
				
		return reverseString;
	}

}
