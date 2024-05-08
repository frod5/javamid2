package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV2 {
	public static void main(String[] args) {
		AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
		AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3();

		// 타입제한 컴파일오류
		// AnimalHospitalV3<Integer> integerAnimalHospitalV3 = new AnimalHospitalV3();

		Dog dog = new Dog("멍멍이1", 100);
		Cat cat = new Cat("냐옹이1", 300);

		//개 병원
		dogHospital.set(dog);
		dogHospital.checkUp();


		//고양이 병원
		catHospital.set(cat);
		catHospital.checkUp();

		//문제1: 개 병원에 고양이 전달
		// dogHospital.set(cat); //타입 제한으로 컴파일 오류

		//문제2 : 개 타입 변환
		dogHospital.set(dog);
		Animal bigger = dogHospital.bigger(new Dog("멍멍이2", 200));
		System.out.println("bigger = " + bigger);
	}
}
