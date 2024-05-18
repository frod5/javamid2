package collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {

    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        //빈 불변 리스트 생성
        List<Integer> emptyList1 = Collections.emptyList(); // 자바5
        List<Integer> emptyList2 = List.of(); // 자바9

        System.out.println("emptyList1.getClass() = " + emptyList1.getClass());
        System.out.println("emptyList2.getClass() = " + emptyList2.getClass());

        // Arrays.asList() vs List.of()
        // Arrays.asList()는 해당 크기만큼 요소를 변경할 수 있음 (가변) 하지만 크기는 조정하지 못함
        // List.of()는 불변
        // Arrays.asList(arr)은 arr 배열의 참조값을 그대로 사용하기에 값을 바꾸 arr의 요소 값도 같이 변경
        // 배열의 길이가 엄청 많은 데이터인 경우에는 asList()를 사용하면 따로 생성 비용이 들지 않음. List.of() 새로 만들기 떄문에 생성 비용이 많이 듬. 대부분의 경우에는 List.of() 사용 권장

        Integer[] arr = {1,2,3,4,5};
        List<Integer> list3 = Arrays.asList(arr);
        List<Integer> list4 = List.of(arr);
    }
}
