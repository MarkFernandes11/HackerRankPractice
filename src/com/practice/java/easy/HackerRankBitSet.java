package com.practice.java.easy;

import java.util.BitSet;

import com.practice.java.util.Utility;

public class HackerRankBitSet {

	public static void main(String[] args) {

		int n = Utility.getInteger();
		int m = Utility.getInteger();
		
		BitSet b1 = new BitSet(n);
		BitSet b2 = new BitSet(n);
		
		while(m > 0) {
			String operation = Utility.getWord();
			int value1 = Utility.getInteger();
			int value2 = Utility.getInteger();
			
			switch (operation.toLowerCase()) {
			case "and":
				if(value1 == 1) {
					b1.and(b2);
				} else {
					b2.and(b1);
				}
				break;
			
			case "or":
				if(value1 == 1) {
					b1.or(b2);
				} else {
					b2.or(b1);
				}
				break;
				
			case "xor":
				if(value1 == 1) {
					b1.xor(b2);
				} else {
					b2.xor(b1);
				}
				break;
				
			case "flip":
				if(value1 == 1) {
					b1.flip(value2);
				} else {
					b2.flip(value2);
				}
				break;
				
			case "set":
				if(value1 == 1) {
					b1.set(value2);
				} else {
					b2.set(value2);
				}
				break;	

			default:
				break;
			}
			
			System.out.println(b1.cardinality()+" "+b2.cardinality());
			m--;
		}
		
	}

}
