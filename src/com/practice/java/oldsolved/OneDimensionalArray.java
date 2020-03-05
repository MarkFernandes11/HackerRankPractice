/******************************************************************************
*  Purpose: To store and retrieve data from a 1D array.  			
*                        
*  @author  MarkF
*  @date   02-03-2020
*
******************************************************************************/

/******************************************************************************
*
*   Input Format :
*    
*   The first line contains a single integer, n, denoting the size of the array. Each
*   line i of the n subsequent lines contains a single integer denoting the value of element a[i].
*
*	Output Format :
*   
*   You are not responsible for printing any output to stdout. Locked code in the editor
*   loops through array  and prints each sequential element on a new line.
*   
******************************************************************************/

package com.practice.java.oldsolved;

import java.util.Scanner;

public class OneDimensionalArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of an array");
        int n = scanner.nextInt();
        int[] a = new int[n];
        
        // Stores each value in array a
        for (int i = 0; i < a.length; i++) {
        	System.out.println("Enter element at index "+i);
        	a[i] = scanner.nextInt(); 
        }
        
        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        
        scanner.close();
	}

}
