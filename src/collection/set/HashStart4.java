package collection.set;

import java.util.Arrays;

public class HashStart4 {

	static final int CAPACITY = 10;
	public static void main(String[] args) {
		// 1,2,5,8,14,99
		System.out.println("hashIndex(1) = " + hashIndex(1));
		System.out.println("hashIndex(2) = " + hashIndex(2));
		System.out.println("hashIndex(5) = " + hashIndex(5));
		System.out.println("hashIndex(8) = " + hashIndex(8));
		System.out.println("hashIndex(14) = " + hashIndex(14));
		System.out.println("hashIndex(99) = " + hashIndex(99));

		Integer[] inputArray = new Integer[CAPACITY];
		add(inputArray, 1);
		add(inputArray, 2);
		add(inputArray, 5);
		add(inputArray, 8);
		add(inputArray, 14);
		add(inputArray, 99);
		System.out.println("inputArray = " + Arrays.toString(inputArray));

		//검색
		int searchValue = 14;
		int hashIndex = hashIndex(searchValue);
		System.out.println("hashIndex = " + hashIndex);
		Integer result = inputArray[hashIndex]; // O(1)
		System.out.println("result = " + result);

		// hashIndex 사용으로 인해 메모리낭비도 줄이고 검색 성능도 O(1)로 최적화.
		// 하지만 1 , 11 같은 hashIndex 임으로 같이 저장하지 못하는 한계 발생.
	}

	private static void add(Integer[] inputArray, int value) {
		int hashIndex = hashIndex(value);
		inputArray[hashIndex] = value;
	}

	static int hashIndex(int value) {
		return value % CAPACITY;
	}
}
