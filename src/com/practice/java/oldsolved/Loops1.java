/******************************************************************************
*  Purpose: Using loops to help us do some simple math.
*                        
*  @author  MarkF
*  @date   23-02-2020
*
******************************************************************************/


/******************************************************************************
*
*   Input Format :
*    
*   A single integer, n.
*                        
*   Output Format :
*   
*   Print 10 lines of output; each line i (where 1<=i<=10) contains the result of n*i in the form:
*	n x i = result.
*
******************************************************************************/

package com.practice.java.oldsolved;

import com.practice.java.util.Utility;

public class Loops1 {

	public static void main(String[] args) {

		System.out.println("Enter a number whose first 10 multiples you need to print");
		int number = Utility.getInteger();
		
		Utility.printMultiplesUpto10(number);		
	}

}
