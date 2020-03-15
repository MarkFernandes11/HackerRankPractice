package com.practice.java.util;

import java.math.BigInteger;
import java.util.Scanner;

public class Utility {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static Byte getByte() {
		Byte number = scanner.nextByte();
		return number;
	}
	
	public static Short getShort() {
		Short number = scanner.nextShort();
		return number;
	}
	
	public static Integer getInteger() {
		Integer number = scanner.nextInt();
		return number;
	}
	
	public static Long getLong() {
		Long number = scanner.nextLong();
		return number;
	}
	
	public static Float getFloat() {
		Float number = scanner.nextFloat();
		return number;
	}
	
	public static Double getDouble() {
		Double number = scanner.nextDouble();
		return number;
	}
	
	public static Boolean getBoolean() {
		Boolean value = scanner.nextBoolean();
		return value;
	}
	
	public static Character getCharacter() {
		Character value = getWord().charAt(0);
		return value;
	}
	
	public static String getWord() {
		String word = scanner.next();
		return word;
	}
	
	public static String getLine() {
		String line = scanner.nextLine();
		return line;
	}

	public static BigInteger getBigInteger() {
		BigInteger value = scanner.nextBigInteger();
		return value;
	}	
	
	public static Boolean hasNext() {
		Boolean value = scanner.hasNext();
		return value;
	}
	
	public static String getReverseString(String string) {

		String reverseString = "";
		
		if(string.length() != 0) {
			for(int i=(string.length()-1); i>=0; i--) {
				reverseString += string.charAt(i);
			}
		}
				
		return reverseString;
	}
	
	public static void printMultiplesUpto10(int number) {
		int i;
		for( i=1 ; i<=10 ; i++) {
			System.out.println(number+" x "+i+" = "+(number*i));
		}
	}
}
