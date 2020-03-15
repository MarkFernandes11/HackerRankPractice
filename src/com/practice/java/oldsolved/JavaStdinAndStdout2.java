/******************************************************************************
*  Purpose: The code below creates a Scanner object named scanner and uses it to read 3 integers.
*  			It then closes the Scanner object because there is no more input to read, and prints 
*  			to stdout using System.out.println().
*                        
*  @author  MarkF
*  @version 1.0
*  @date   23-02-2020
*
******************************************************************************/


/******************************************************************************
*   Input Format :
*    
*   There are three lines of input:
*	1. The first line contains an integer.
*	2. The second line contains a double.
*	3.The third line contains a String.
*                        
*   Output Format :
*   
*   There are three lines of output:
*	1. On the first line, print String: followed by the unaltered String read from stdin.
*	2. On the second line, print Double: followed by the unaltered double read from stdin.
*	3. On the third line, print Int: followed by the unaltered integer read from stdin.
*
******************************************************************************/

package com.practice.java.oldsolved;

import com.practice.java.util.Utility;

public class JavaStdinAndStdout2 {

	public static void main(String[] args) {
		
        System.out.println("Enter a integer ");
        int realNumber = Utility.getInteger();

        System.out.println("Enter a double ");
        double fractionNumber = Utility.getDouble();
        Utility.getLine();
        
        System.out.println("Enter a string ");
        String string = Utility.getLine();
        
        System.out.println("String: "+string);
        System.out.println("Double: "+fractionNumber);
        System.out.println("Int: "+realNumber);
        
	}

}
	