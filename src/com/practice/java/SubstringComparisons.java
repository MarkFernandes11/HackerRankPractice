/******************************************************************************
*  Purpose: To find the largest and smallest substring of a given string whose
*  			substring length is given based on the constraints.  			
*                        
*  @author  MarkF
*  @date   29-02-2020
*
******************************************************************************/


/******************************************************************************
*
*   Input Format :
*    
*   The first line contains a string denoting s.
*	The second line contains an integer denoting k.
*
*	Constraints :
*
*	1 <= |s| <= 1000
*	s consists of English alphabetic letters only (i.e., [a-zA-Z]).
*                        
*	Output Format :
*   
*   Return the respective lexicographically smallest and largest substrings as a 
*   single newline-separated string.
*
******************************************************************************/

package com.practice.java;

import java.util.Scanner;

public class SubstringComparisons {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String string = scanner.next();
		System.out.println("Enter length of substring");
		int lengthOfSubstring = scanner.nextInt();
		
		System.out.println(getSmallestAndLargestSubstring(string, lengthOfSubstring));
		
		scanner.close();
	}

	private static String getSmallestAndLargestSubstring(String string, int lengthOfSubstring) {

		String smallest = "";
		String largest = "";
		int i;
		
		if(string.length() >= lengthOfSubstring) {
			smallest = string.substring(0, lengthOfSubstring);
			largest = string.substring(0, lengthOfSubstring);
			
			for(i=1; i<=(string.length()-lengthOfSubstring); i++) {
				if(string.substring(i, i+lengthOfSubstring).compareTo(smallest) < 0) {
					smallest = string.substring(i, i+lengthOfSubstring);
				}
				if(string.substring(i, i+lengthOfSubstring).compareTo(largest) > 0) {
					largest = string.substring(i, i+lengthOfSubstring);
				}
				
//				System.out.println(string.substring(i, i+lengthOfSubstring));
			}
		}
		
		return smallest+"\n"+largest;
	}

}
