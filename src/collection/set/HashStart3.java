package collection.set;

import java.util.Arrays;

public class HashStart3 {
	public static void main(String[] args) {
		// 입력 1,2,5,8,14,99
		Integer[] inputArr = new Integer[100];
		inputArr[1] = 1;
		inputArr[2] = 2;
		inputArr[5] = 5;
		inputArr[8] = 8;
		inputArr[14] = 14;
		inputArr[99] = 99;
		System.out.println("inputArr = " + Arrays.toString(inputArr));

		int searchValue = 99;
		Integer findValue = inputArr[searchValue];
		System.out.println("findValue = " + findValue); // O(1)

		//메모리 낭비가 너무심하다.
	}
}
