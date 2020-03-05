/******************************************************************************
*  Purpose: To check whether the syntax of the given pattern is valid.
*                        
*  @author  MarkF
*  @date   02-03-2020
*
******************************************************************************/


/******************************************************************************
*
*   Input Format :
*    
*   The first line of input contains an integer N, denoting the number of test cases.
*   The next N lines contain a string of any printable characters representing the
*   pattern of a regex.
*
*	Output Format :
*   
*   For each test case, print Valid if the syntax of the given pattern is correct.
*   Otherwise, print Invalid. Do not print the quotes.
*
******************************************************************************/

package com.practice.java.oldsolved;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SyntaxChecker {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of test cases");
		int numberOfTestCases = scanner.nextInt();
		scanner.nextLine();
		
		while(numberOfTestCases > 0) {
			System.out.println("Enter a string to be checked");
			String pattern = scanner.nextLine();
			
			try {
				Pattern patternCheck = Pattern.compile(pattern);
				System.out.println("Valid");
				numberOfTestCases--;
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
				numberOfTestCases--;
			}
		}
		
		scanner.close();
	}

}
