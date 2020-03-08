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
		String line = scanner.next();
		return line;
	}

	public static BigInteger getBigInteger() {
		BigInteger value = scanner.nextBigInteger();
		return value;
	}	
	
}
