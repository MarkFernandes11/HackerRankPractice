/******************************************************************************
*  Purpose: To understand singleton pattern.  			
*                        
*  @author  MarkF
*  @date   15-03-2020
*
******************************************************************************/

/******************************************************************************
*
*	Information :
*
*	Complete the Singleton class in your editor which contains the following components:
*
*	A private Singleton non parameterized constructor.
*	A public String instance variable named str.
*	Write a static method named getSingleInstance that returns the single instance 
*	of the Singleton class.
*	
*	Once submitted, our hidden Solution class will check your code by taking a String 
*	as input and then using your Singleton class to print a line.
*
*   Input Format :
*    
*   You will not be handling any input in this challenge.
*
*	Output Format :
*   
*   You will not be producing any output in this challenge.
*
******************************************************************************/

package com.practice.java.easy;

import com.practice.java.util.Utility;

class Singleton {
	
	public String str;
	
	{
		System.out.println("Enter a string");
		str = Utility.getLine();
	}
	
	private Singleton() {
		System.out.println("Hello I am a singleton! Let me say "+str+" to you");
	}
	
	public static Singleton getSingleInstance() {
		return new Singleton();
	}
}

public class SingletonPatternHR {
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Singleton singleton = Singleton.getSingleInstance();
	}
	
}
