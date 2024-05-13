package collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {
	private static final int DEFAULT_CAPACITY = 5;

	private Object[] elementData;
	private int size = 0;

	public MyArrayList() {
		elementData = new Object[DEFAULT_CAPACITY];
	}

	public MyArrayList(int initialCapacity) {
		elementData = new Object[initialCapacity];
	}

	@Override
	public int size() {
		return size;
	}
	@Override
	public void add(E obj) {
		//코드 추가
		if(size == elementData.length) {
			grow();
		}
		elementData[size] = obj;
		size++;
	}
	@Override
	public void add(int index, E obj) {
		//코드 추가
		if(size == elementData.length) {
			grow();
		}

		//데이터 이동
		shiftRightFrom(index);
		elementData[index] = obj;
		size++;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) {
		return (E)elementData[index];
	}

	@Override
	public E set(int index, E obj) {
		E oldData = get(index);
		elementData[index] = obj;
		return oldData;
	}

	@Override
	public E remove(int index) {
		E oldValue = get(index);
		//데이터이동
		shiftLeftFrom(index);

		size--;
		elementData[size] = null;
		return oldValue;
	}


	@Override
	public int indexOf(E obj) {
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

	private void shiftRightFrom(int index) {
		for (int i = size; i > index; i--) {
			elementData[i] = elementData[i-1];
		}
	}

	private void shiftLeftFrom(int index) {
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i+1];
		}
	}

	private void grow() {
		//배열을 새로 만들고, 기존배열을 새로운 배열에 복사
		elementData = Arrays.copyOf(elementData, elementData.length * 2);
	}
}
