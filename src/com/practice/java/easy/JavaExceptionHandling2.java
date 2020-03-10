/******************************************************************************
*  Purpose: To understand inheritance concept 2.  			
*                        
*  @author  MarkF
*  @date   10-03-2020
*
******************************************************************************/

/******************************************************************************
*
*	Input Format :
*    
*   Each line of the input contains two integers, n and p. The locked stub code 
*   in the editor reads the input and sends the values to the method as parameters.
*   
*   Constraints :
*   
*   -10 <= n <= 10
*   -10 <= p <= 10
*   
*	Output Format :
*   
*   Each line of the output contains the result n^p, if both n and p are positive. 
*   If either n or p is negative, the output contains "n and p should be non-negative".
*   If both n and p are zero, the output contains "n and p should not be zero.". 
*   This is printed by the locked stub code in the editor.
*
******************************************************************************/

package com.practice.java.easy;

import com.practice.java.util.Utility;

public class JavaExceptionHandling2 {

	public static final MyCalculator1 my_calculator = new MyCalculator1();

	public static void main(String[] args) {
		while (Utility.hasNext()) {
			int n = Utility.getInteger();
			int p = Utility.getInteger();

			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}

class MyCalculator1 {

	public String power(int n, int p) {
		String result = "";
		if (n == 0 && p == 0) {
			result = "java.lang.Exception: n and p should not be zero.";
		} else if (n < 0 || p < 0) {
			result = "java.lang.Exception: n or p should not be negative.";
		} else {
			result = ((long) Math.pow(n, p)) + "";
		}

		return result;
	}

}
