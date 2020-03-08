/******************************************************************************
*  Purpose: To understand inheritance concept 2.  			
*                        
*  @author  MarkF
*  @date   08-03-2020
*
******************************************************************************/

/******************************************************************************
*
*	Write the following code in your editor below:
*
*	1. A class named Arithmetic with a method named add that takes 2 integers 
*	   as parameters and returns an integer denoting their sum.
*	2. A class named Adder that inherits from a superclass named Arithmetic.
*	Your classes should not be be public.
*
*   Input Format :
*    
*   You are not responsible for reading any input from stdin; a locked code stub 
*   will test your submission by calling the add method on an Adder object and 
*   passing it 2 integer parameters.
*   
*	Output Format :
*   
*   You are not responsible for printing anything to stdout. Your add method must
*   return the sum of its parameters.
*
******************************************************************************/

package com.practice.java.easy;

class Arithmetic {
	public int add(int number1, int number2) {
		int sum = number1 + number2;
		return sum;
	}
}

class Adder extends Arithmetic {
	
}

public class JavaInheritance2 {
	public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();
        
        // Print the name of the superclass on a new line
        System.out.println("My superclass name is: " + a.getClass().getSuperclass().getName());
        System.out.println("My superclass is: " + a.getClass().getSuperclass());
        System.out.println("My class is: " + a.getClass());
        System.out.println("My class reference variable is: " + a);
        
        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}

