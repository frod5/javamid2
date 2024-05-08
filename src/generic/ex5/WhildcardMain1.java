package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WhildcardMain1 {
	public static void main(String[] args) {
		Box<Object> objBox = new Box<>();
		Box<Dog> dogBox = new Box<>();
		Box<Cat> catBox = new Box<>();

		dogBox.set(new Dog("멍멍이", 100));

		WhildcardEx.printGenericV1(dogBox);
		WhildcardEx.printWhildcardV1(dogBox);

		WhildcardEx.printGenericV2(dogBox);
		WhildcardEx.printWhildcardV2(dogBox);

		Dog dog = WhildcardEx.printAndReturnGeneric(dogBox);
		Animal animal = WhildcardEx.printAndReturnWhildcard(dogBox);
	}
}
