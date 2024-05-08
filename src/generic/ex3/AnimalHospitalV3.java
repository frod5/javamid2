package generic.ex3;

import generic.animal.Animal;

//타입 매개 변수를 Animal과 그의 자식만 받도록 제한.
public class AnimalHospitalV3<T extends Animal> {
	private T animal;

	public void set(T animal) {
		this.animal = animal;
	}

	public void checkUp() {

		//타입 매개변수 제한으로 인해 최소 animal의 기능을 사용할 수 있다.
		System.out.println("동물 이름: " + animal.getName());
		System.out.println("동물 크기: " + animal.getSize());
		animal.sound();
	}

	public T bigger(T target) {
		return animal.getSize() > target.getSize() ? animal : target;
	}
}
