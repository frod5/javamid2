package collection.map.test;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> dictionaryMap = new HashMap<>();

        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String engInput = sc.nextLine();
            if(engInput.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String korInput = sc.nextLine();
            dictionaryMap.put(engInput, korInput);
        }

        System.out.println();
        System.out.println("==단어 검색 단계==");

        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String input = sc.nextLine();
            if(input.equals("q")) {
                break;
            }
            System.out.println(input+"의 뜻: " + dictionaryMap.getOrDefault(input, "찾을 수 없음"));
        }

        System.out.println("프로그램 종료");
    }
}
