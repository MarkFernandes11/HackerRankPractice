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


package com.practice.java.oldsolved;

import com.practice.java.util.Utility;

public class StringReverse {

	public static void main(String[] args) {

		System.out.println("Enter a string to check if it is palindrome");
		String string = Utility.getWord();
		
		String reverseString = Utility.getReverseString(string);
		
		if(string.equals(reverseString)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
