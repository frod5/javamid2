package collection.compare;

import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        // treeSet, treeMap은 처음 부터 Comaparator, Comparable 필요하다
        // 해당 정렬 기준으로 트리를 생성하기 때문에.

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet1);

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("IdComparator 정렬");
        System.out.println(treeSet2);
    }
}
