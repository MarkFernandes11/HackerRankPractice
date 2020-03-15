/******************************************************************************
*  Purpose: To understand if-else conditional statements to automate decision-
*  			making processes.
*                        
*  @author  MarkF
*  @date   23-02-2020
*
******************************************************************************/


/******************************************************************************
*
*	Task :
*	Given an integer, n, perform the following conditional actions:
*
*	-If  is odd, print Weird
*	-If  is even and in the inclusive range of 2 to 5, print Not Weird
*	-If  is even and in the inclusive range of 6 to 20, print Weird
*	-If  is even and greater than 20, print Not Weird
* 
*   Input Format :
*    
*   A single line containing a positive integer, n.
*                        
*   Output Format :
*   
*   Print Weird if the number is weird; otherwise, print Not Weird.
*
******************************************************************************/

package com.practice.java.oldsolved;

import com.practice.java.util.Utility;

public class IfElse {

	public static void main(String[] args) {

		int n = Utility.getInteger();
		
		if(n%2 == 1) {
			System.out.println("Weird");
		} else if ((n%2 == 0) && (n>=2 && n<=5)) {
			System.out.println("Not Weird");
		} else if ((n%2 == 0) && (n>=6 && n<=20)) {
			System.out.println("Weird");   
		} else {
			System.out.println("Not Weird");
		}	
		
	}

}
