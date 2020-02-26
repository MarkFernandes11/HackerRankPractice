/******************************************************************************
*  Purpose: To find the substring of a given string whose start and end index
*  			are given based on the constraints.
*                        
*  @author  MarkF
*  @date   26-02-2020
*
******************************************************************************/


/******************************************************************************
*
*   Input Format :
*    
*   The first line contains a single string denoting s.
*	The second line contains two space-separated integers denoting the respective
*	values of start and end.
*
*	Constraints :
*
*	1 <= |s| <= 100
*	0 <= start < end <= n
*	String s consists of English alphabetic letters (i.e., [a-zA-Z]) only.
*                        
*	Output Format :
*   
*   Print the substring in the inclusive range from start to end-1.
*
******************************************************************************/

package com.practice.java;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = scanner.next();
		System.out.println("Enter start of substring");
		int start = scanner.nextInt();
		System.out.println("Enter end of substring");
		int end = scanner.nextInt();
		
		if(start>=0 && start<end && end<=s.length()) {
			System.out.println(s.substring(start, end));
		}
		
		scanner.close();
	}

}
