/******************************************************************************
*  Purpose: To understand overriding concept using super keyword.  			
*                        
*  @author  MarkF
*  @date   08-03-2020
*
******************************************************************************/

/******************************************************************************
*
*	Output Format :
*   
*   You are given a partially completed code in the editor. Modify the code so 
*   that the code prints the following text:
*   
*   Hello I am a motorcycle, I am a cycle with an engine.
*   My ancestor is a cycle who is a vehicle with pedals.
*
******************************************************************************/

package com.practice.java.easy;

class BiCycle{
	String define_me() {
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	String define_me() {
		return "a cycle with an engine.";
	}
	
	MotorCycle() {
		System.out.println("Hello I am a motorcycle, I am "+ define_me());

		String temp=super.define_me();

		System.out.println("My ancestor is a cycle who is "+ temp );
	}
	
}
public class JavaMethodOverriding2 {
	public static void main(String []args) {
		MotorCycle m = new MotorCycle();
	}
}
