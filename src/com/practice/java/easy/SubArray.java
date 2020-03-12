/******************************************************************************
*  Purpose: To find total count of consecutive negative sub arrays of a given array.
*                        
*  @author  MarkF
*  @date   12-03-2020
*
******************************************************************************/

/******************************************************************************
*
*	Input Format :
*    
*   The first line contains a single integer, n, denoting the length of array 
*   A = [a0, a1,..., an-1].
*	The second line contains n space-separated integers describing each 
*	respective element, ai, in array A.
*
*	Constraints :
* 
* 	1 <= n <= 100
* 	-10^4 <= ai <= 10^4
*   
*	Output Format :
*   
*   Print the number of subarrays of A having negative sums.
*
******************************************************************************/

package com.practice.java.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.practice.java.util.Utility;

public class SubArray {

	public static void main(String[] args) {

		System.out.println("Enter size of array");
		int size = Utility.getInteger();
		
		int[] array = new int[size];
		List<Integer> subArrayList = new ArrayList<Integer>(); 
		int i;
		int count = size;
		
		System.out.println("Enter "+size+" elements");
		for(i = 0; i < array.length; i++) {
			array[i] = Utility.getInteger();
		}
		
		while(count > 0) {
			for(i = 0; i < array.length; i++) {
				
				if(i+count <= array.length) {
					subArrayList.add(subArraySum(array, i, i+count));
				} else {
					break;
				}			
			}
			count--;
		}
		
		System.out.println(negativeCount(subArrayList));
	}
	
	public static int subArraySum(int[] array, int startIndex, int endIndex) {
		int sum = 0;
		int[] subArray = Arrays.copyOfRange(array, startIndex, endIndex);
		
		for(int value : subArray) {
			sum += value;
		}

		return sum;
	}
	
	public static int negativeCount(List<Integer> subArrayList) {
		int count = 0;
		
		for(Integer value: subArrayList) {
			if(value < 0) {
				count++;
			}
		}
		
		return count;
	}

}
