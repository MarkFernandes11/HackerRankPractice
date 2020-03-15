/******************************************************************************
*  Purpose: To get name of day, based on entered date, month and year.     			
*                        
*  @author  MarkF
*  @date   15-03-2020
*
******************************************************************************/

/******************************************************************************
*
*	Input Format :
*    
*   The first line contains a string denoting a.
*	The second line contains a string denoting b.
* 
* 	Constraints :
* 
* 	1 <= length(a),length(b) <= 50
*	Strings a and b consist of English alphabetic characters.
*	The comparison should NOT be case sensitive.
*   
*	Output Format :
*   
*   Print "Anagrams" if a and b are case-insensitive anagrams of each other; 
*   otherwise, print "Not Anagrams" instead.
*
******************************************************************************/

package com.practice.java.easy;

import com.practice.java.util.Utility;

public class Anagrams {
	
	static boolean isAnagram(String a, String b) {

		boolean result = false;
		a = a.replaceAll("\\s+", "").trim().toLowerCase();
		b = b.replaceAll("\\s+", "").trim().toLowerCase();
		
//		System.out.println("String 1 is before sort "+a);
//		System.out.println("String 2 is before sort "+b);
		
		if(a.length() == b.length()) {
			result = compare(a, b);
		} else {
			result = false;
		}		
		return result;
    }
	
	private static boolean compare(String a, String b) {
		
		boolean result = false;
		char[] array1 = a.toCharArray();
		char[] array2 = b.toCharArray();
		
		a = sort(array1);
		b = sort(array2);
		
//		System.out.println("String 1 is "+a);
//		System.out.println("String 2 is "+b);
		
		result = a.compareTo(b) == 0 ? true : false;
		
		return result;
	}
	
	private static String sort(char[] array) {
	
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					char temp = array[j]; 
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return String.valueOf(array);
	}

    public static void main(String[] args) {
    
    	System.out.println("Enter first string");
        String a = Utility.getWord();
        
        System.out.println("Enter second string");
        String b = Utility.getWord();
        
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
