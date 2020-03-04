/******************************************************************************
*  Purpose: To add and multiply huge numbers! These numbers are so big that
*  			you can't contain them in any ordinary data types like a long integer.  			
*                        
*  @author  MarkF
*  @date   04-03-2020
*
******************************************************************************/

/******************************************************************************
*
*   Input Format :
*    
*   There will be two lines containing two numbers, a and b.
*
*	Constraints :
*
*	a and b are non-negative integers and can have maximum 200 digits.
*                        
*	Output Format :
*   
*   Output two lines. The first line should contain a + b, and the second line
*   should contain a * b. Don't print any leading zeros.
*
******************************************************************************/

package com.practice.java.easy;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number 1");
		BigInteger number1 = scanner.nextBigInteger();

		System.out.println("Enter number 2");
		BigInteger number2 = scanner.nextBigInteger();

		BigInteger sum = number1.add(number2);
		BigInteger prod = number1.multiply(number2);

		System.out.println(sum);
		System.out.println(prod);

		scanner.close();

	}

}
