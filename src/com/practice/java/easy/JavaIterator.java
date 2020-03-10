/******************************************************************************
*  Purpose: To understand instanceof concept in Java.  			
*                        
*  @author  MarkF
*  @date   08-03-2020
*
******************************************************************************/

/******************************************************************************
*   
*   Sample Input :
*   
*   5
*	Student
*	Student
*	Rockstar
*	Student
*	Hacker
*
*	Sample Output :
*   
*	3 1 1
*
******************************************************************************/

package com.practice.java.easy;

import java.util.ArrayList;
import java.util.Iterator;

import com.practice.java.util.Utility;

public class JavaIterator {

	static Iterator<Object> func(ArrayList<Object> mylist) {
		Iterator<Object> it = mylist.iterator();
		while (it.hasNext()) {
			Object element = it.next();
			
			if(element instanceof String) break; 			
		}
		
		return it;
	}

	public static void main(String[] args) {
		ArrayList<Object> mylist = new ArrayList<>();
		
		System.out.println("Enter value of n for elements before \'###\'");
		int n = Utility.getInteger();
		
		System.out.println("Enter value of m for elements after \'###\'");
		int m = Utility.getInteger();
		
		System.out.println("Enter integer values");
		for (int i = 0; i < n; i++) {
			mylist.add(Utility.getInteger());
		}

		mylist.add("###");
		
		System.out.println("Enter string values");
		for (int i = 0; i < m; i++) {
			mylist.add(Utility.getWord());
		}

		Iterator<Object> it = func(mylist);
		while (it.hasNext()) {
			Object element = it.next();
			System.out.println((String) element);
		}

	}
}