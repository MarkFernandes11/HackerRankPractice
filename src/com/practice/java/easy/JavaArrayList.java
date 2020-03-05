/******************************************************************************
*  Purpose: To answer a few queries where you need to tell the number located
*  			in yth position of xth line.  			
*                        
*  @author  MarkF
*  @date   04-03-2020
*
******************************************************************************/

/******************************************************************************
*
*   Input Format :
*    
*   The first line has an integer n. In each of the next n lines there will be an
*   integer d denoting number of integers on that line and then there will be d 
*   space-separated integers. In the next line there will be an integer q denoting
*   number of queries. Each query will consist of two integers x and y.
*
*	Constraints :
*
*	+ 1 <= n <= 20000
*	+ 0 <= d <= 50000
*	+ 1 <= q <= 1000
*	+ 1 <= x <= n
*
*	Each number will fit in signed integer.
*	Total number of integers in n lines will not cross 10^5.
*                        
*	Output Format :
*   
*   In each line, output the number located in yth position of xth line. If there is no 
*   such position, just print "ERROR!"
*
******************************************************************************/

package com.practice.java.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter n");
		int n = scanner.nextInt();
		
		List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();

		while(n-- > 0) {
			System.out.println("Enter d");
			int d = scanner.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			
			for (int i = 0; i < d; i++) {
				list.add(scanner.nextInt());
			}
			listOfLists.add(list);
		}

		System.out.println("List of lists size "+listOfLists.size());
		
		List<String> resultList = new ArrayList<String>();
		
		System.out.println("Enter number of queries");
		int queries = scanner.nextInt();
		
		while(queries-- > 0) {
			System.out.println("Enter line number");
			int line = scanner.nextInt();
			
			System.out.println("Enter position");
			int position = scanner.nextInt();
			
			if(listOfLists.size() >= line) {
				try {
					if (listOfLists.get(line-1).get(position-1) != null) {
						resultList.add(listOfLists.get(line-1).get(position-1).toString());
					}
				} catch (IndexOutOfBoundsException e) {
					resultList.add("ERROR!");
				}

			} else {
				resultList.add("ERROR!");
			}
		}
		
		for(String s: resultList) {
			System.out.println(s);
		}
		
		scanner.close();
	}

}
