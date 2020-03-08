/******************************************************************************
*  Purpose: To understand interface concept.  			
*                        
*  @author  MarkF
*  @date   08-03-2020
*
******************************************************************************/

/******************************************************************************
*
*	You are given an interface AdvancedArithmetic which contains a method signature 
*	int divisor_sum(int n). You need to write a class called MyCalculator which 
*	implements the interface.
*
*	divisorSum function just takes an integer as input and return the sum of all 
*	its divisors. For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum 
*	should return 12. The value of n will be at most 1000.
*
*	Read the partially completed code in the editor and complete it. You just 
*	need to write the MyCalculator class only. Your class shouldn't be public.
*
******************************************************************************/

package com.practice.java.easy;

import com.practice.java.util.Utility;

interface AdvancedArithmetic {
	
	int divisorSum(int number);
}

class MyCalculator implements AdvancedArithmetic {
	
	@Override
	public int divisorSum(int number) {
		int sum = 0;
		int i;
		
		for(i = 1; i <= number/2; i++) {
			if((number % i) == 0) {
				sum += i;
			}
		}
		
		return sum + number;
	}
}

public class JavaInterface {
	public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        
        System.out.println("Enter a number");
        int n = Utility.getInteger();
        System.out.print(my_calculator.divisorSum(n) + "\n");

    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        @SuppressWarnings("rawtypes")
		Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
