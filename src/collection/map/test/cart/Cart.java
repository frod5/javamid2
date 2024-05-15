package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cart = new HashMap<>();

    public void add(Product product, int quantity) {
        int before = getQuantity(product);
        cart.put(product, before + quantity);
    }

    public void minus(Product product, int quantity) {
        int before = getQuantity(product);
        int update = before - quantity;
        if(update <= 0) {
            cart.remove(product);
        } else {
            cart.put(product, update);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
            System.out.println("상품: " + entry.getKey() +" 수량: " + entry.getValue());
        }
    }

    private int getQuantity(Product product) {
        return cart.getOrDefault(product, 0);
    }
}
