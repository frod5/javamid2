package generic.ex4;

public class MethodMain1 {
	public static void main(String[] args) {
		Integer i = 10;
		Object o = GenericMethod.objMethod(i);

		// 타입 인자 명시적 전달
		System.out.println("타입 인자 명시적 전달");
		Integer result = GenericMethod.<Integer>genericMethod(i);
		System.out.println("result = " + result);

		Integer integerValue = GenericMethod.<Integer>numberMethod(10);
		Double doubleValue = GenericMethod.<Double>numberMethod(20.0);


		// 타입 추론
		System.out.println("타입 추론");
		Integer integerValue1 = GenericMethod.numberMethod(10);
		Double doubleValue1 = GenericMethod.numberMethod(20.0);
	}
}
