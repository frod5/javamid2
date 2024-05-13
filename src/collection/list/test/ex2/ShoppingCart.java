package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> itemList = new ArrayList<>();

	public void add(Item item) {
		itemList.add(item);
	}

	public void displayItem() {
		int price = 0;
		System.out.println("장바구니 상품 출력");
		for (Item item : itemList) {
			System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
			price += item.getTotalPrice();
		}
		System.out.println("전체 가격 합: " + price);
	}
}
