package collection.map.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ItemPriceTest {

    /**
     *  Map에 들어있는 데이터 중 값이 1000원인 모든 상품 출력하기
     */
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("사과", 500, "바나나", 500, "망고", 1000, "딸기", 1000);
        List<String> resultList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue().equals(1000)) {
                resultList.add(entry.getKey());
            }
        }

        System.out.println(resultList);
    }
}
