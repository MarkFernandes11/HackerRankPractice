/******************************************************************************
*  Purpose: To understand covariant return types and complete the given code
*  			so that it could be executed.  			
*                        
*  @author  MarkF
*  @date   15-03-2020
*
******************************************************************************/

/******************************************************************************
*
*   Input Format :
*    
*   The locked code reads a single string denoting the name of a subclass of State 
*   (i.e., WestBengal, Karnataka, or AndhraPradesh), then tests the methods associated 
*   with that subclass. You are not responsible for reading any input from stdin.
*
*	Output Format :
*   
*   Output is handled for you by the locked code, which creates the object corresponding 
*   to the input string's class name and then prints the name returned by that class' 
*   national flower's whatsYourName method. You are not responsible for printing anything 
*   to stdout.
*
******************************************************************************/

package com.practice.java.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Flower {
	String whatsYourName() {
		return "I have many names and types.";
	}
}

class Jasmine extends Flower {
	@Override
	String whatsYourName() {
		return "Jasmine";
	}
}

class Lily extends Flower {
	@Override
	String whatsYourName() {
		return "Lily";
	}
}

class Region {
	Flower yourNationalFlower() {
		return new Flower();
	}
}

class WestBengal extends Region {
	Jasmine yourNationalFlower() {
		return new Jasmine();
	}
}

class AndhraPradesh extends Region {
	Lily yourNationalFlower() {
		return new Lily();
	}
}

public class CovarianReturnTypes {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	      String s = reader.readLine().trim();
	      Region region = null;
	      switch (s) {
	        case "WestBengal":
	          region = new WestBengal();
	          break;
	        case "AndhraPradesh":
	          region = new AndhraPradesh();
	          break;
	      }
	      Flower flower = region.yourNationalFlower();
	      System.out.println(flower.whatsYourName());
	}

}


