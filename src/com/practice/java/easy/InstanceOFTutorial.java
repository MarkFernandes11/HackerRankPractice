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

import java.util.*;

import com.practice.java.util.Utility;

class Rockstar {
}

class Hacker {
}

class Student1 {
}

public class InstanceOFTutorial {

	static String count(ArrayList<Object> mylist) {
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < mylist.size(); i++) {
			Object element = mylist.get(i);

//         System.out.println("element instanceof Student1 "+(element instanceof Student1));
//         System.out.println("element instanceof Rockstar "+(element instanceof Rockstar));
//         System.out.println("element instanceof Hacker "+(element instanceof Hacker));

			if (element instanceof Student1)
				a++;

			if (element instanceof Rockstar)
				b++;

			if (element instanceof Hacker)
				c++;

		}
		String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
		return ret;
	}

	public static void main(String[] args) {
		ArrayList<Object> mylist = new ArrayList<>();
		
		System.out.println("Enter number of objects to be entered");
		int t = Utility.getInteger();

		for (int i = 0; i < t; i++) {
			System.out.println("Enter object name");
			String s = Utility.getWord();
			if (s.equals("Student"))
				mylist.add(new Student1());
			if (s.equals("Rockstar"))
				mylist.add(new Rockstar());
			if (s.equals("Hacker"))
				mylist.add(new Hacker());
		}
		System.out.println(count(mylist));

	}
}