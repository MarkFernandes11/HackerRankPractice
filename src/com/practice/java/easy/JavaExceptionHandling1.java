/******************************************************************************
*  Purpose: To test your knowledge on try-catch block.  			
*                        
*  @author  MarkF
*  @date   10-03-2020
*
******************************************************************************/

package com.practice.java.easy;

import com.practice.java.util.Utility;

public class JavaExceptionHandling1 {

	public static void main(String[] args) {
		String message = "";

		try {
			System.out.println("Enter input 1");
			int input1 = Utility.getInteger();
			
			System.out.println("Enter input 2");
			int input2 = Utility.getInteger();
			
			int result = input1/input2;
			System.out.println(result);
		} catch (Exception exception) {
			
			message = (exception.toString().contains("InputMismatchException")) ? "java.util.InputMismatchException" : exception.toString(); 
			
			System.out.println(message);
		}		
	}

}
