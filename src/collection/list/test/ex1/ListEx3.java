package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
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

		int sum = list.stream().mapToInt(v->v).sum();
		double avg = (double) sum / list.size();

		System.out.println("입력한 정수의 합계: " + sum);
		System.out.println("입력한 정수의 평균: " + avg);
	}
}
