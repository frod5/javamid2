package collection.set;

import java.util.Arrays;

public class HashStart2 {
	public static void main(String[] args) {
		// 입력 1,2,5,8
		//
		Integer[] inputArr = new Integer[10];
		inputArr[1] = 1;
		inputArr[2] = 2;
		inputArr[5] = 5;
		inputArr[8] = 8;
		System.out.println("inputArr = " + Arrays.toString(inputArr));

		int searchValue = 8;
		Integer findValue = inputArr[searchValue];
		System.out.println("findValue = " + findValue); // O(1)
	}
}
