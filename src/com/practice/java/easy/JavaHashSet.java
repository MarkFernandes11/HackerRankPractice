/******************************************************************************
*  Purpose: To find the total unique pairs entered by the user.  			
*                        
*  @author  MarkF
*  @date   08-03-2020
*
******************************************************************************/

/******************************************************************************
*
*   Input Format :
*    
*   In the first line, there will be an integer T denoting number of pairs. 
*   Each of the next T lines will contain two strings seperated by a single space.
*
*	Constraints:
*	
*	1 <= T <= 100000
*	Length of each string is atmost 5 and will consist lower case letters only.
*
*	Output Format :
*   
*   Print T lines. In the ith line, print number of unique pairs you have after
*   taking ith pair as input.
*
******************************************************************************/

package com.practice.java.easy;

import java.util.HashSet;

import com.practice.java.util.Utility;

public class JavaHashSet {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		int totalPairCount = 0;
		
		System.out.println("Enter number of pairs to enter");
		int pairs = Utility.getInteger();
		int i;
		
		for(i = 0; i < pairs; i++) {
			System.out.println("Enter 1st name of pair");
			String name1 = Utility.getWord().trim().toLowerCase();
			System.out.println("Enter 2nd name of pair");
			String name2 = Utility.getWord().trim().toLowerCase();
			
			totalPairCount += uniquepairCount(name1, name2, set);
			
			System.out.println(totalPairCount);
		}
		
	}
	
	private static int uniquepairCount(String name1, String name2, HashSet<String> set) {

		int count = set.add(name1+" "+name2) ? 1 : 0;

		return count;
	}

}
