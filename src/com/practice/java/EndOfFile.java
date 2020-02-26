/******************************************************************************
*  Purpose: The challenge here is to read n lines of input until you reach EOF,
*  then number and print all n lines of content.
*                        
*  @author  MarkF
*  @date   26-02-2020
*
******************************************************************************/


/******************************************************************************
*
*   Input Format :
*    
*   Read some unknown n lines of input from stdin(System.in) until you reach EOF;
*   each line of input contains a non-empty String.
*                        
*	Output Format :
*   
*   For each line, print the line number, followed by a single space, and then 
*   the line content received as input.
*
******************************************************************************/

package com.practice.java;

import java.util.Scanner;

public class EndOfFile {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int lineNumber = 1;
		
		while(scanner.hasNext()) {
			System.out.println(lineNumber+" "+scanner.nextLine());
			lineNumber++;
		}
		scanner.close();
	}

}
