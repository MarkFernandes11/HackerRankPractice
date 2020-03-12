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
*   The first line contains 2 space-separated integers, N (the length of both BitSets
*   B1 and B2) and M (the number of operations to perform), respectively.
*	The M subsequent lines each contain an operation in one of the following forms:
*
*	AND <set> <set> 
*	OR <set> <set>
*	XOR <set> <set>
*	FLIP <set> <index>
*	SET <set> <index>
*	In the list above, <set> is the integer 1 or 2, where 1 denotes B1 and 2 denotes B2.
*	<index> is an integer denoting a bit's index in the BitSet corresponding to <set>.
*
*	For the binary operations AND, OR, and XOR, operands are read from left to right 
*	and the BitSet resulting from the operation replaces the contents of the first operand.
*	For example:
*
*	AND 2 1
*
*	B2 is the left operand, and B1 is the right operand. This operation should assign the
* 	result of B2 ^ B1 to B2.
* 
* 	Constraints :
* 
* 	1 <= N <= 1000
* 	1 <= M <= 10000
*   
*	Output Format :
*   
*   After each operation, print the respective number of set bits in BitSet B1 and BitSet B2 
*   as 2 space-separated integers on a new line.
*
******************************************************************************/

package com.practice.java.easy;

import com.practice.java.util.Utility;

public class JavaBitSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter length of BitSet");
		int length = Utility.getInteger();

		int[] b1 = new int[length];
		int[] b2 = new int[length];

		System.out.println("Enter number of BitSet operations");
		int operations = Utility.getInteger();

		while (operations-- > 0) {
			System.out.println("Enter operation to perform");
			String operation = Utility.getWord();

			System.out.println("Enter value1");
			int value1 = Utility.getInteger();

			System.out.println("Enter value2");
			int value2 = Utility.getInteger();

			bitsOperation(operation, value1, value2, b1, b2);
		}
	}

	private static void bitsOperation(String operation, int value1, int value2, int[] b1, int[] b2) {
//		BitSet bitSet = new BitSet(b1.length);
		switch (operation.toLowerCase()) {
		case "and":
			add(b1, b2, value1, value2);
			break;

		case "or":
			or(b1, b2, value1, value2);
			break;

		case "xor":
			xor(b1, b2, value1, value2);
			break;

		case "flip":
			flip(b1, b2, value1, value2);
			break;

		case "set":
			set(b1, b2, value1, value2);
			break;

		default:
			break;
		}
	}

	private static void add(int[] b1, int[] b2, int value1, int value2) {

		if (value1 == 1) {
			for (int i = 0; i < b1.length; i++) {
				b1[i] = (b1[i] == 1 && b2[i] == 1) ? 1 : 0;
			}
		} else {
			for (int i = 0; i < b1.length; i++) {
				b2[i] = (b1[i] == 1 && b2[i] == 1) ? 1 : 0;
			}
		}

		bitsCountValue(b1, b2);
	}

	private static void or(int[] b1, int[] b2, int value1, int value2) {

		if (value1 == 1) {
			for (int i = 0; i < b1.length; i++) {
				b1[i] = (b1[i] == 1 || b2[i] == 1) ? 1 : 0;
			}
		} else {
			for (int i = 0; i < b1.length; i++) {
				b2[i] = (b1[i] == 1 || b2[i] == 1) ? 1 : 0;
			}
		}

		bitsCountValue(b1, b2);
	}

	private static void xor(int[] b1, int[] b2, int value1, int value2) {

		if (value1 == 1) {
			for (int i = 0; i < b1.length; i++) {
				b1[i] = b1[i] == b2[i] ? 0 : 1;
			}
		} else {
			for (int i = 0; i < b1.length; i++) {
				b2[i] = b1[i] == b2[i] ? 0 : 1;
			}
		}

		bitsCountValue(b1, b2);
	}

	private static void set(int[] b1, int[] b2, int value1, int value2) {

		if (value1 == 1 && value2 < b1.length) {
			b1[value2] = 1;
			bitsCountValue(b1, b2);
		} else if (value1 == 2 && value2 < b1.length) {
			b2[value2] = 1;
			bitsCountValue(b1, b2);
		} else {
			bitsCountValue(b1, b2);
		}
	}

	private static void flip(int[] b1, int[] b2, int value1, int value2) {

		if (value1 == 1 && value2 < b1.length) {
			b1[value2] = (b1[value2] == 1) ? 0 : 1;
			bitsCountValue(b1, b2);
		} else if (value1 == 2 && value2 < b1.length) {
			b2[value2] = (b2[value2] == 1) ? 0 : 1;
			bitsCountValue(b1, b2);
		} else {
			bitsCountValue(b1, b2);
		}
	}

	private static void bitsCountValue(int[] b1, int[] b2) {
		int b1Count = 0;
		int b2Count = 0;

		for (int i : b1) {
			b1Count += (i == 1) ? 1 : 0;
		}

		for (int i : b2) {
			b2Count += (i == 1) ? 1 : 0;
		}

		System.out.println(b1Count + " " + b2Count);
	}

}
