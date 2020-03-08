/******************************************************************************
*  Purpose: Generic methods are a very efficient way to handle multiple datatypes
*  using a single method. This problem will test your knowledge on Java Generic methods.  			
*                        
*  @author  MarkF
*  @date   07-03-2020
*
******************************************************************************/

package com.practice.java.easy;

import java.lang.reflect.Method;

class Printer
{
//	public void printArray(String[] array) {
//		for(String item : array) {
//			System.out.println(item);
//		}
//	}
//	
//	public void printArray(Integer[] array) {
//		for(Integer item : array) {
//			System.out.println(item);
//		}
//	}
	
	public void printArray(Object[] array) {
		for(Object item : array) {
			System.out.println(item);
		}
	}
}

public class JavaGenerics {
	public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}
