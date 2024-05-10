package collection.link;

public class MyLinkedListV3<E> {
	private Node<E> first;
	private int size = 0;

	public void add(E e) {
		Node<E> newNode = new Node<>(e);
		if (first == null) {
			first = newNode;
		} else {
			Node<E> lastNode = getLastNode();
			lastNode.next = newNode;
		}
		size++;
	}

	/**
	 * 추가코
	 *
	 * @param index
	 * @param e
	 */
	public void add(int index, E e) {
		Node<E> newNode = new Node<>(e);
		if (index == 0) {
			newNode.next = first;
			first = newNode;
		} else {
			Node<E> prev = getNode(index - 1);
			newNode.next = prev.next;
			prev.next = newNode;
		}
		size++;
	}

	public Object remove(int index) {
		Node<E> removeNode = getNode(index);
		E removeItem = removeNode.item;

		if (index == 0) {
			first = removeNode.next;
		} else {
			Node<E> prev = getNode(index - 1);
			prev.next = removeNode.next;
		}

		removeNode.item = null;
		removeNode.next = null;
		size--;

		return removeItem;
	}

	public E set(int index, E e) {
		Node<E> x = getNode(index);
		E oldValue = x.item;
		x.item = e;
		return oldValue;
	}

	public E get(int index) {
		return (E)getNode(index).item;
	}

	public int indexOf(E e) {
		Node<E> x = first;
		int index = 0;

		while (x != null) {
			if (x.item.equals(e)) {
				return index;
			}
			x = x.next;
			index++;
		}

		return -1;
	}

	public int size() {
		return size;
	}

	private Node<E> getLastNode() {
		Node<E> x = first;
		while (x.next != null) {
			x = x.next;
		}
		return x;
	}

	private Node<E> getNode(int index) {
		Node<E> x = first;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

	@Override
	public String toString() {
		return "MyLinkedListV1{" +
			"first=" + first +
			", size=" + size +
			'}';
	}

	private static class Node<E> {

		E item;

		Node<E> next;

		public Node(E item) {
			this.item = item;
		}

		/**
		 * [A -> B -> C]
		 *
		 * @return
		 */
		@Override
		public String toString() {

			StringBuilder sb = new StringBuilder();
			Node<E> x = this;
			sb.append("[");

			while (x != null) {
				sb.append(x.item);
				if (x.next != null) {
					sb.append("->");
				}
				x = x.next;
			}

			sb.append("]");

			return sb.toString();
		}
	}
}
