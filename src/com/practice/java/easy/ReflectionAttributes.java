/******************************************************************************
*  Purpose: To print all the methods of Student class in alphabetical order.
*                        
*  @author  MarkF
*  @date   13-03-2020
*
******************************************************************************/

/******************************************************************************
*
*	There is no sample input/output for this problem.
*	Hint: See the oracle docs for more details about JAVA Reflection Methods and 
*	Fields. 
*
******************************************************************************/

package com.practice.java.easy;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student2 {
	private String name;
    private String id;
    private String email;
	
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    public void anotherMethod() {	
	}
}

public class ReflectionAttributes {

	public static void main(String[] args) {

		List<String> methodList = new ArrayList<String>();
		
		@SuppressWarnings("rawtypes")
		Class object = Student2.class;
		
		Method[] methods = object.getDeclaredMethods();
		
		for(Method method : methods) {
			methodList.add(method.getName());
		}
		
		Collections.sort(methodList);
		
		for(String methodName : methodList) {
			System.out.println(methodName);
		}
	}

}
