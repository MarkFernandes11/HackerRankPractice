/******************************************************************************
*  Purpose: To perform bitwise operations such as AND, OR, XOR, FLIP and SET
*  			according to the provided conditions.  			
*                        
*  @author  MarkF
*  @date   10-03-2020
*
******************************************************************************/

/******************************************************************************
*
*	Input Format :
*    
*   There are six lines of input, each containing an integer.
* 
*	Output Format :
*   
*   There will be only four lines of output. Each line contains the sum of the 
*   integers passed as the parameters to add in the main method.
*
******************************************************************************/

package com.practice.java.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class JavaVarargs {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			int n6 = Integer.parseInt(br.readLine());
			
			Add ob = new Add();
			ob.add(n1, n2);
			ob.add(n1, n2, n3);
			ob.add(n1, n2, n3, n4, n5);
			ob.add(n1, n2, n3, n4, n5, n6);
			
			Method[] methods = Add.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;

			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());
			}

			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class Add {
	
	public void add(int... values) {
		int sum = 0;
		
		if(values.length > 0) {
			String result = "" + values[0];
			sum = values[0];
			for(int i = 1; i < values.length; i++) {
				result += "+" + values[i];
				sum += values[i];
			}
			
			result += "=" + sum;
			System.out.println(result);
		}

	}
	
}
