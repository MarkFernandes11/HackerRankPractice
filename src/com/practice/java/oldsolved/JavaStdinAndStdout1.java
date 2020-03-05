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
*   There are  lines of input, and each line contains a single integer.
*                        
*   Output Format :
*   
*   Each integer must be printed on a new line.
*
******************************************************************************/

package com.practice.java.oldsolved;

import java.util.Scanner;

public class JavaStdinAndStdout1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i;
		int[] array = new int[3];
		
		for(i=0; i<array.length; i++) {
			array[i] = scanner.nextInt();
			System.out.println(array[i]);
		}

		scanner.close();
	}

}
