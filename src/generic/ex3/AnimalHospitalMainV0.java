package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
	public static void main(String[] args) {
		DogHospital dogHospital = new DogHospital();
		CatHospital catHospital = new CatHospital();

		Dog dog = new Dog("멍멍이1", 100);
		Cat cat = new Cat("냐옹이1", 300);

		//개 병원
		dogHospital.set(dog);
		dogHospital.checkUp();


		//고양이 병원
		catHospital.set(cat);
		catHospital.checkUp();

		//문제1: 개 병원에 고양이 전달
		// dogHospital.set(cat); 컴파일 오류

		//문제2 : 개 타입 변환
		dogHospital.set(dog);
		Dog bigger = dogHospital.bigger(new Dog("멍멍이2", 200));
		System.out.println("bigger = " + bigger);
	}
}
