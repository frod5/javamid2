package collection.set.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        List<Integer> list1 = Arrays.asList(inputArr);
        List<Integer> list2 = List.of(inputArr);

        //자바 9 이상에서는 List.of() 사용하는 걸 권장.

        System.out.println("set = " + set);
    }
}
