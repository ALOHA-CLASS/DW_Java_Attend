package _16.컬렉션;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>(); // 중복을 허용하지 않는 컬렉션

        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("사과"); // 중복이라 추가되지 않음

        System.out.println("과일 목록: " + fruits);
        System.out.println("크기: " + fruits.size()); // 2
        System.out.println("포함 여부: " + fruits.contains("바나나"));
    }
}
