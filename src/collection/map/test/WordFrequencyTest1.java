package collection.map.test;

import java.util.HashMap;

public class WordFrequencyTest1 {

    /**
     * 단어가 몇번 반복 하는지 카운트 하기
     */
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] words = text.split(" ");
        HashMap<String, Integer> result = new HashMap<>();

        for (String word : words) {
            /*Integer count = result.get(word);
            if(count == null) {
                count = 0;
            }
            count++;*/

            result.put(word, (result.getOrDefault(word, 0)) + 1);
        }

        System.out.println(result);
    }
}
