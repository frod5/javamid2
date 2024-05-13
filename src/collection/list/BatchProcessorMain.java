package collection.list;

public class BatchProcessorMain {
	public static void main(String[] args) {
		// BatchProcessor processor = new BatchProcessor(new MyArrayList<Integer>());
		BatchProcessor processor = new BatchProcessor(new MyLinkedList<Integer>());
		processor.logic(50_000);

	}
}
