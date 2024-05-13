package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
	public static void main(String[] args) {
		int size = 50_000;
		System.out.println("==JavaArrayList 추가==");
		addFirst(new ArrayList<>(), size);
		addMid(new ArrayList<>(), size); // 찾는데 O(1), 데이터 추가 O(n)
		List<Integer> arrayList = new ArrayList<>(); // 조회용 데이터로 사용
		addLast(arrayList, size); // 찾는데 O(1), 데이터 추가 O(1)

		int loop = 10_000;
		System.out.println("==JavaArrayList 조회==");
		getIndex(arrayList, loop, 0);
		getIndex(arrayList, loop, size / 2);
		getIndex(arrayList, loop, size-1);

		System.out.println("==JavaArrayList 검색==");
		search(arrayList, loop, 0);
		search(arrayList, loop, size / 2);
		search(arrayList, loop, size-1);

		System.out.println("==JavaLinkedList 추가==");
		addFirst(new LinkedList<>(), size);
		addMid(new LinkedList<>(), size);	// 찾는데 O(n), 데이터 추가 O(1)
		List<Integer> link = new LinkedList<>(); // 조회용 데이터로 사용
		addLast(link, size); // 찾는데 O(1), 데이터 추가 O(1) - 자바는 마지막노드위치도 알고 있어서 O(1)로 최적화

		System.out.println("==JavaLinkedList 조회==");
		getIndex(link, loop, 0);
		getIndex(link, loop, size / 2);
		getIndex(link, loop, size-1);

		System.out.println("==JavaLinkedList 검색==");
		search(link, loop, 0);
		search(link, loop, size / 2);
		search(link, loop, size-1); // 자바는 이중연결리스트를 활용하여 인덱스가 뒤에서 가까우면 뒤에서부터 검색
	}

	private static void addFirst(List<Integer> list, int size) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			list.add(0, i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("앞에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
	}

	private static void addMid(List<Integer> list, int size) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			list.add(i / 2, i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("평균에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
	}

	private static void addLast(List<Integer> list, int size) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			list.add(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("뒤에 추가 - 크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
	}

	private static void getIndex(List<Integer> list, int loop, int index) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < loop; i++) {
			list.get(index);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("index : " + index + ", 반복: " + loop + ", 계산 시간 : " + (endTime - startTime) + "ms");
	}

	private static void search(List<Integer> list, int loop, int findValue) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < loop; i++) {
			list.indexOf(findValue);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("findValue : " + findValue + ", 반복: " + loop + ", 계산 시간 : " + (endTime - startTime) + "ms");
	}
}
