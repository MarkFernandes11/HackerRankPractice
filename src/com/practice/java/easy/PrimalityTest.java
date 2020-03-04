/******************************************************************************
*  Purpose: To use the Java BigInteger class' isProbablePrime method to 
*  			determine and print whether it's prime or not prime.  			
*                        
*  @author  MarkF
*  @date   04-03-2020
*
******************************************************************************/


/******************************************************************************
*
*   Input Format :
*    
*   A single line containing an integer, n (the number to be checked).
*
*	Constraints :
*
*	n contains at most 100 digits.
*                        
*	Output Format :
*   
*   If n is a prime number, print prime; otherwise, print not prime.
*
******************************************************************************/

package com.practice.java.easy;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number to check if it is prime or not");
		String s = scanner.nextLine();
		
		BigInteger bigInteger = new BigInteger(s);

		if(bigInteger.isProbablePrime(1)) {
			 System.out.println("prime");
		} else { 
			System.out.println("not prime");
		}

		scanner.close();
		
	}

}
