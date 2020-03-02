/******************************************************************************
*  Purpose: To check if a entered user name is valid or not.  			
*                        
*  @author  MarkF
*  @date   02-03-2020
*
******************************************************************************/

/******************************************************************************
*
*   Input Format :
*    
*   The first line of input contains an integer n, describing the total number 
*   of usernames. Each of the next n lines contains a string describing the 
*   username. The locked stub code reads the inputs and validates the username.
*
*	Constraints :
*
*	1 <= n <= 100
*	The username consists of any printable characters.
*                        
*	Output Format :
*   
*   For each of the usernames, the locked stub code prints Valid if the username
*   is valid; otherwise Invalid each on a new line.
*   
*   Conditions :
*   
*   ++ The username consists of 8 to 30 characters inclusive. If the username 
*   consists of less than 8 or greater than 30 characters, then it is an invalid username.
*   
*   ++ The username can only contain alphanumeric characters and underscores (_).
*    Alphanumeric characters describe the character set consisting of lowercase 
*    characters [a - z], uppercase characters [A - Z], and digits [0 - 9].
*   
*   ++ The first character of the username must be an alphabetic character, i.e.,
*    either lowercase character [a - z] or uppercase character [A - Z]. 
*
******************************************************************************/

package com.practice.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernameRegex {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of test cases");
		int testCasesCount = scanner.nextInt();
		scanner.nextLine();

		String pattern = "[a-zA-Z][a-zA-Z0-9_]{7,29}";

		while (testCasesCount > 0) {
			System.out.println("Enter username");
			String username = scanner.next();

			try {
				Pattern patternCheck = Pattern.compile(pattern);
				Matcher matcher = patternCheck.matcher(username);

				if (matcher.matches()) {
					System.out.println("Valid");
				} else {
					System.out.println("Invalid");
				}
			} catch (Exception e) {
				System.out.println("Exception thrown");
			}

			testCasesCount--;
		}

		scanner.close();
	}

}

/*  Code from hacker rank
 * import java.util.Scanner;
 *  
 * class UsernameValidator {
 * 
 * public static final String regularExpression = "[a-zA-Z][a-zA-Z0-9_]{7,29}";
 * }
 * 
 * 
 * public class Solution { private static final Scanner scan = new
 * Scanner(System.in);
 * 
 * public static void main(String[] args) { int n =
 * Integer.parseInt(scan.nextLine()); while (n-- != 0) { String userName =
 * scan.nextLine();
 * 
 * if (userName.matches(UsernameValidator.regularExpression)) {
 * System.out.println("Valid"); } else { System.out.println("Invalid"); } } } }
 */