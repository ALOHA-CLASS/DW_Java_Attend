package _16.컬렉션;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(); // 크기가 자동으로 늘어나는 리스트

        names.add("홍길동");
        names.add("이순신");
        names.add("강감찬");

        System.out.println("전체 목록: " + names);
        System.out.println("첫 번째 이름: " + names.get(0));
        System.out.println("크기: " + names.size());

        names.remove("이순신");
        System.out.println("삭제 후: " + names);
    }
}
