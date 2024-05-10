package collection.link;

import static collection.link.NodeMain3.*;

public class MyLinkedListV1 {
	private Node first;
	private int size = 0;

	public void add(Object e) {
		Node newNode = new Node(e);
		if(first == null) {
			first = newNode;
		} else {
			Node lastNode = getLastNode();
			lastNode.next = newNode;
		}
		size ++;
	}

	public Object set(int index, Object e) {
		Node x = getNode(index);
		Object oldValue = x.item;
		x.item = e;
		return oldValue;
	}

	public Object get(int index) {
		return getNode(index).item;
	}

	public int indexOf(Object e) {
		Node x = first;
		int index = 0;

		while (x != null) {
			if(x.item.equals(e)) {
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

	private Node getLastNode() {
		Node x = first;
		while (x.next != null) {
			x = x.next;
		}
		return x;
	}

	private Node getNode(int index) {
		Node x = first;
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
}
