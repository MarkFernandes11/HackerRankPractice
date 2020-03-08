/******************************************************************************
*  Purpose: To understand inheritance concept using child and parent class.  			
*                        
*  @author  MarkF
*  @date   08-03-2020
*
******************************************************************************/

package com.practice.java.easy;

	class Animal {
		void walk() {
			System.out.println("I am walking");
		}
	}
	
	class Bird extends Animal {
		void fly() {
			System.out.println("I am flying");
		}
	
		void sing() {
			System.out.println("I am singing");
		}
	}
	
	public class JavaInheritance1 {
	
		public static void main(String args[]) {
	
			Bird bird = new Bird();
			bird.walk();
			bird.fly();
			bird.sing();
		}
	}