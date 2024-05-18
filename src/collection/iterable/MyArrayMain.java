package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("iterator 사용");

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("next = " + next);
        }

        //추가
        //향상된 for문
        //Iterable을 구현해야 사용할 수 있다.
        System.out.println("for-each 사용");
        for (Integer next : myArray) {
            System.out.println("next = " + next);
        }
    }
}
