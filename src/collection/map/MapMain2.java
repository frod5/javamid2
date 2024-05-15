package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap =  new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println("studentMap = " + studentMap);

        studentMap.put("studentA", 100);  // 같은 키에 저장시 기존값 교체
        System.out.println("studentMap = " + studentMap);

        boolean containsKey = studentMap.containsKey("studentA");
        System.out.println("containsKey = " + containsKey);

        // 특정 학생의 값 삭제
        studentMap.remove("studentA");
        System.out.println("studentMap = " + studentMap);

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 50);
        System.out.println("studentMap = " + studentMap);

        // 학생이 없는 경우에만 추가1
        if(!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100);
        }
        System.out.println("studentMap = " + studentMap);

        // 학생이 없는 경우에만 추가2
        studentMap.putIfAbsent("studentA", 100);
        studentMap.putIfAbsent("studentB", 100);
        System.out.println("studentMap = " + studentMap);
    }
}
