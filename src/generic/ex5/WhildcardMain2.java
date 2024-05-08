package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WhildcardMain2 {
	public static void main(String[] args) {
		Box<Object> objBox = new Box<>();
		Box<Animal> animalBox = new Box<>();
		Box<Dog> dogBox = new Box<>();
		Box<Cat> catBox = new Box<>();

		// Animal 포함 상위 타입 전달 가능
		writeBox(animalBox);
		writeBox(objBox);

		// 와일드카드 하한
		// writeBox(dogBox);
		// writeBox(catBox);

		Animal animal = animalBox.get();
		System.out.println("animal = " + animal);

		// 하한 와일드카드는 제네릭 타입, 제네릭 메소드에는 사용할 수 없다.
	}

	static void writeBox(Box<? super Animal> box) {
		box.set(new Dog("멍멍이", 100));
	}
}
