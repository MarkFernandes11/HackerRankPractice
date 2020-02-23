/******************************************************************************
*  Purpose: To print a sequence of form a+2^0*b, a+2^0*b+2^1*b till  2^n-1*b.
*                        
*  @author  MarkF
*  @date   23-02-2020
*
******************************************************************************/


/******************************************************************************
*
*   Input Format :
*    
*   The first line contains an integer, q, denoting the number of queries.
*	Each line i of the q subsequent lines contains three space-separated integers 
*	describing the respective a, b, and n(i) values for that query.
*                        
*	Constraints :
*	    
*   0<=q<=500
*   0<=a,b<=50
*   1<=n<=15
*                    
*   Output Format :
*   
*   For each query, print the corresponding series on a new line. Each series must be
*   printed in order as a single line of n space-separated integers.
*
******************************************************************************/

package com.practice.java;

import java.util.Scanner;

public class Loops2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of test cases");
		int testCases = scanner.nextInt();
		int i, a, b, n, j;
		long sum = 0;
		
		for( i=0; i<testCases; i++ ) {
			System.out.println("Enter value of a");
			a = scanner.nextInt();
			System.out.println("Enter value of b");
			b = scanner.nextInt();
			System.out.println("Enter value of n");
			n = scanner.nextInt();

			for(j=0; j<n; j++) {
				if(j == 0) {
					sum = a + (long) Math.pow(2, j) * b;
					System.out.print(sum+" ");
					continue;
				}
				
				sum = sum + ((long) Math.pow(2, j)) * b;
				System.out.print(sum+" ");
			}
			System.out.println();
			sum = 0;
		}
		
		scanner.close();
		
	}

}
