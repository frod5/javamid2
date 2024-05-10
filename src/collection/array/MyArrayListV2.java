package collection.array;

import java.util.Arrays;

public class MyArrayListV2 {
	private static final int DEFAULT_CAPACITY = 5;

	private Object[] elementData;
	private int size = 0;

	public MyArrayListV2() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayListV2(int initialCapacity) {
		elementData = new Object[initialCapacity];
	}

	public int size() {
		return size;
	}

	public void add(Object obj) {
		//코드 추가
		if(size == elementData.length) {
			grow();
		}
		elementData[size] = obj;
		size++;
	}

	private void grow() {
		//배열을 새로 만들고, 기존배열을 새로운 배열에 복사
		elementData = Arrays.copyOf(elementData, elementData.length * 2);
	}

	public Object get(int index) {
		return elementData[index];
	}

	public Object set(int index, Object obj) {
		Object oldData = get(index);
		elementData[index] = obj;
		return oldData;
	}

	public int indexOf(Object obj) {
		for (int i = 0; i < size; i++) {
			if(elementData[i].equals(obj)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOf(elementData, size)) + " size= " +
			size + " ,capacity=" + elementData.length;
	}
}
