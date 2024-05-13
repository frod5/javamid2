package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("n개의 정수를 입력하세요 (종료 0)");
		while (true) {
			int value = sc.nextInt();
			if(value == 0) {
				break;
			}
			list.add(value);
		}

		System.out.println("출력");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
			if(i != list.size() - 1) {
				sb.append(", ");
			}
		}
		System.out.println(sb);
	}
}
