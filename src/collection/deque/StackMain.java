package collection.deque;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {

        //LIFO (Last In First Out) 후입 선출
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // 다음 꺼낼 요소 확인 (꺼내진 않고 조회만)
        System.out.println("stack.peek() = " + stack.peek());

        // 스택 요소 뽑기
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);

        // 주의 - 스택 클래스는 사용하지말자.
        // 스택 클래스는 내부에서 Vector 자료 구조 사용. Vector는 자바 1.0에 개발 되어, 현재는 사용되지 않고, 호환만을 위한 자료구조.
        // 대신 Deque를 사용하는 것이 좋다.
    }
}
