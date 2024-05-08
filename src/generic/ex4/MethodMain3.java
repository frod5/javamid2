package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
	public static void main(String[] args) {
		Dog dog = new Dog("멍멍이", 100);
		Cat cat = new Cat("나옹이", 50);
		ComplexBox<Dog> hospital = new ComplexBox<Dog>();
		hospital.set(dog);
		hospital.printAndReturn(cat);
	}
}
