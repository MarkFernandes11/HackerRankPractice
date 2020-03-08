/******************************************************************************
*  Purpose: Given a list, L, of N integers, perform Q queries on the list. Once all
*  queries are completed, print the modified list as a single line of space-separated integers.  			
*                        
*  @author  MarkF
*  @date   05-03-2020
*
******************************************************************************/

/******************************************************************************
*
*   Input Format :
*    
*   The first line contains an integer, N (the initial number of elements in L).
*	The second line contains N space-separated integers describing L.
*	The third line contains an integer, Q (the number of queries).
*	The 2Q subsequent lines describe the queries, and each query is described over two lines:
*
*	+ If the first line of a query contains the String Insert, then the second line contains
*	  two space separated integers x y, and the value y must be inserted into L at index x.
*	+ If the first line of a query contains the String Delete, then the second line contains
*	  index x, whose element must be deleted from L.
*
*	Constraints :
*
*	1 <= N <= 4000
*	1 <= Q <= 4000
*	Each element in is a 32-bit integer.
*
*	Output Format :
*   
*   Print the updated list L as a single line of space-separated integers.
*
******************************************************************************/

package com.practice.java.easy;

import java.util.ArrayList;
import java.util.List;

import com.practice.java.util.Utility;

public class JavaList {

	public static void main(String[] args) {

		System.out.println("Enter initial size of list");
		int listSize = Utility.getInteger();
		
		List<Integer> list = new ArrayList<Integer>();
		int i, index, value;
		String query;
		
		System.out.println("Enter "+ listSize +" elements in list");
		for (i = 0; i < listSize; i++) {
			list.add(Utility.getInteger());
		}
		
		System.out.println("Enter number of queries");
		int queries = Utility.getInteger();
		
		for (i = 0; i < queries; i++) {
			System.out.println("Enter query");
			query = Utility.getWord();
			
			if(query.equalsIgnoreCase("insert")) {
				System.out.println("Enter index");
				try {
					index = Utility.getInteger();
					
					System.out.println("Enter value");
					value = Utility.getInteger();
					
					list.add(index, value);
				} catch (Exception e) {
					System.out.println("You have entered index which is out of bounds");
				}
			} else if (query.equalsIgnoreCase("delete")) {
				System.out.println("Enter index");
				try {
					index = Utility.getInteger();
					
					list.remove(index);
				} catch (Exception e) {
					System.out.println("You have entered index which is out of bounds");
				}
			}
		}
		
		for (i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}

	}

}
