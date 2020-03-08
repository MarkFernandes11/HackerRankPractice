/******************************************************************************
*  Purpose: To understand abstract class concept.  			
*                        
*  @author  MarkF
*  @date   08-03-2020
*
******************************************************************************/

package com.practice.java.easy;

import com.practice.java.util.Utility;

abstract class Book {
	String title;
	
	abstract void setTitle(String s);
	
	String getTitle() {
		return title;
	}
}

class MyBook extends Book {
	void setTitle(String s) {
		title = s;
	}
}

public class JavaAbstractClass {
	
	public static void main(String []args){
//		Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		System.out.println("Enter a title");
		String title = Utility.getLine();
		MyBook new_novel=new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: "+new_novel.getTitle());
      	
	}
}
