package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV2<T> {
	private T animal;

	public void set(T animal) {
		this.animal = animal;
	}

	public void checkUp() {
		// 메소드를 정의하는 시점에는 T의 타입을 알지못함.
		// System.out.println("동물 이름: " + animal.getName());
		// System.out.println("동물 크기: " + animal.getSize());
		// animal.sound();
	}

	public T bigger(T target) {
		return null;
		// return animal.getSize() > target.getSize() ? animal : target;
	}
}
