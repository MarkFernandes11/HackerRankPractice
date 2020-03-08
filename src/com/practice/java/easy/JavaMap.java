/******************************************************************************
*  Purpose: To print the phone number of that person if found in the address
*  			book.  			
*                        
*  @author  MarkF
*  @date   06-03-2020
*
******************************************************************************/

/******************************************************************************
*
*   Input Format :
*    
*   The first line will have an integer n denoting the number of entries in the phone book. 
*   Each entry consists of two lines: a name and the corresponding phone number.
*
*	After these, there will be some queries. Each query will contain a person's name. 
*	Read the queries until end-of-file.
*
*	Constraints:
*	A person's name consists of only lower-case English letters and it may be in the format 
*	'first-name last-name' or in the format 'first-name'. Each phone number has exactly 8 
*	digits without any leading zeros.
*
*	1 <= n <= 100000
*	1 <= Q <= 100000
*
*	Output Format :
*   
*   For each case, print "Not found" if the person has no entry in the phone book.
*   Otherwise, print the person's name and phone number. See sample output for the exact format.

*	To make the problem easier, we provided a portion of the code in the editor. 
*	You can either complete that code or write completely on your own.
*
******************************************************************************/

package com.practice.java.easy;

import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		System.out.println("Enter number of entries");
		int n=scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name");
			String name=scanner.nextLine();
			System.out.println("Enter phone number");
			int phone=scanner.nextInt();
			
			map.put(name, phone);
			
			scanner.nextLine();
		}
		while(scanner.hasNext())
		{
			System.out.println("Enter name to be searched");
			String s=scanner.nextLine();
			
			if(map.containsKey(s)) {
				System.out.println(s+"="+map.get(s));
			} else {
				System.out.println("Not found");
			}
			
		}
		
		scanner.close();
	}

}
