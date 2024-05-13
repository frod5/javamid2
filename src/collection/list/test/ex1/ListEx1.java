package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {

		List<Integer> studentList = new ArrayList<>();
		studentList.add(90);
		studentList.add(80);
		studentList.add(70);
		studentList.add(60);
		studentList.add(50);

		Integer sum = studentList.stream().reduce(0, Integer::sum);
		double avg = (double) sum / studentList.size();

		System.out.println("점수 총합 :" + sum);
		System.out.println("점수 평균 :" + avg);
	}
}
