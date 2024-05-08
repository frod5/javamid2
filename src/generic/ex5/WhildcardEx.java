package generic.ex5;

import generic.animal.Animal;

public class WhildcardEx {

	static <T> void printGenericV1(Box<T> box) {
		System.out.println("T = " + box.get());
	}

	static void printWhildcardV1(Box<?> box) {
		System.out.println("? = " + box.get());
	}

	static <T extends Animal> void printGenericV2(Box<T> box) {
		T t = box.get();
		System.out.println("이름 : " + t.getName());System.out.println("크기 : " + t.getSize());
	}

	static void printWhildcardV2(Box<? extends Animal> box) {
		Animal animal = box.get();
		System.out.println("이름 : " + animal.getName());System.out.println("크기 : " + animal.getSize());
	}

	static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
		T t = box.get();
		System.out.println("이름 : " + t.getName());
		return t;
	}

	static Animal printAndReturnWhildcard(Box<? extends Animal> box) {
		Animal animal = box.get();
		System.out.println("이름 : " + animal.getName());
		return animal;
	}
}
