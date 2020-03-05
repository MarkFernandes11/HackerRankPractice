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
*   The first line contains a string A.
*   The second line contains another string B.
*   The strings are comprised of only lowercase English letters.
*   
*   Output Format :
*   
*   There are three lines of output:
*	For the first line, sum the lengths of A and B.
*	For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
*	For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.
*
******************************************************************************/

package com.practice.java.oldsolved;

import java.util.Scanner;

public class StringsIntroduction {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string 1");
		String string1 = scanner.next();
		System.out.println("Enter string 2");
		String string2 = scanner.next();
		
		System.out.println(string1.length()+string2.length());
		
		int comparisonValue = string1.compareTo(string2);
		
		if(comparisonValue > 0) 
			 System.out.println("Yes"); 
		else
			System.out.println("No");
		
		boolean isString1NotEmpty = string1.length() > 0;
		boolean isString2NotEmpty = string2.length() > 0;
		
		String str1 = "";
		String str2 = "";
		int i;
		
		if(isString1NotEmpty) {
			for(i=0; i<string1.length(); i++) {
				if(i == 0) {
					str1 = (string1.charAt(i)+"").toUpperCase();
				}
				else {
					str1 += string1.charAt(i);
				}
			}
		}

		if(isString2NotEmpty) {
			for(i=0; i<string2.length(); i++) {
				if(i == 0) {
					str2 = (string2.charAt(i)+"").toUpperCase();
				}
				else {
					str2 += string2.charAt(i);
				}
			}
		}

		System.out.println(str1+" "+str2);
		scanner.close();
	}

}
