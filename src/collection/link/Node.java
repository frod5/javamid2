package collection.link;

public class Node {

	Object item;

	Node next;

	public Node(Object item) {
		this.item = item;
	}

	/*@Override
	 * IDE toString()
	public String toString() {
		return "Node{" +
			"item=" + item +
			", next=" + next +
			'}';
	}*/

	/**
	 * [A -> B -> C]
	 * @return
	 */
	@Override
	public String toString() {
		//내가 만든거
		// return String.format("%s %s", item, next != null ? "-> " + next : "");

		StringBuilder sb = new StringBuilder();
		Node x = this;
		sb.append("[");

		while (x != null) {
			sb.append(x.item);
			if(x.next != null) {
				sb.append("->");
			}
			x = x.next;
		}

		sb.append("]");

		return sb.toString();
	}
}
