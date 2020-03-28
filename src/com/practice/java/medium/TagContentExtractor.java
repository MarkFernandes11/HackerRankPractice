/******************************************************************************
*  Purpose: To understand covariant return types and complete the given code
*  			so that it could be executed.  			
*                        
*  @author  MarkF
*  @date   22-03-2020
*
******************************************************************************/

/******************************************************************************
*
*   Input Format :
*    
*   The first line of input contains a single integer, N (the number of lines).
*	The N subsequent lines each contain a line of text.
*
*	Constraints
*	
*	1 <= N <= 100
*	Each line contains a maximum of 10^4 printable characters.
*	The total number of characters in all test cases will not exceed 10^6.

*	Output Format :
*   
*   For each line, print the content enclosed within valid tags.
*	If a line contains multiple instances of valid content, print out each 
*	instance of valid content on a new line; if no valid content is found, print None.
*
******************************************************************************/

package com.practice.java.medium;

import java.util.ArrayList;
import java.util.List;

import com.practice.java.util.Utility;

public class TagContentExtractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of test cases");
		int testCases = Utility.getInteger();
		Utility.getLine();
		
		while (testCases-- > 0) {
			System.out.println("Enter sentence");
			String line  = Utility.getLine();
			
			extractTags(line);
//			System.out.println("Line is "+line);
		}
	}
	
	private static void extractTags(String line) {
		List<String> tagList = new ArrayList<String>();
		String tagName = "";
		
		char[] charArray = line.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == '<') {
				tagName += charArray[i];
			}
			
			if(charArray[i] == '>') {
				tagList.add(tagName);
				tagName = "";
			}
		}
		System.out.println(tagList);
		
	}

}
