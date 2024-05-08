package generic.test.ex2;

public class Pair<T1, T2> {
	private T1 first;
	private T2 second;

	public void setFirst(T1 t1) {
		first = t1;
	}

	public void setSecond(T2 t2) {
		second = t2;
	}

	public T1 getFirst() {
		return first;
	}

	public T2 getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return "Pair{" +
			"first=" + first +
			", second=" + second +
			'}';
	}
}
