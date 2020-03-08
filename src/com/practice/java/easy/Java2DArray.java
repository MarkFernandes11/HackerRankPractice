/******************************************************************************
*  Purpose: To print the largest sum among all the hour glasses in the array.  			
*                        
*  @author  MarkF
*  @date   05-03-2020
*
******************************************************************************/

/******************************************************************************
*
*	Hour glass :
*
*	a b c
*	  d
*	e f g
*
*   Input Format :
*    
*   There will be exactly 6 lines, each containing 6 integers separated by spaces.
*   Each integer will be between 9 and -9 inclusive.
*
*	Output Format :
*   
*   Print the answer to this problem on a single line.
*
******************************************************************************/

package com.practice.java.easy;

import com.practice.java.util.Utility;

public class Java2DArray {

	public static void main(String[] args) {

		int i,j;
		int sum = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		
		int[][] array = new int[6][6];

        for (i = 0; i < 6; i++) {
            String[] arrRowItems = Utility.getLine().split(" ");
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            
            System.out.println("Enter element in "+i+" row");
            for (j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                array[i][j] = arrItem;
            }
        }
        
        for (i = 0; i < array.length-2; i++) {
			for (j = 0; j < array[i].length-2; j++) {

				sum = array[i][j] + array[i][j+1] + array[i][j+2] + array[i+1][j+1] +
						array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
				
				System.out.println("Sum = "+sum);
				
				if(sum > max) {
					max =sum;
				}
			}
		}
        
        System.out.println("Max is "+max);
//        System.out.println(max);
        
	}

}
