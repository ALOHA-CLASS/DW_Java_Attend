package _16.컬렉션;

import java.util.HashMap;
import java.util.Map;

public class Ex03 {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>(); // key-value 쌍으로 저장

        scores.put("홍길동", 90);
        scores.put("이순신", 85);
        scores.put("강감찬", 95);

        System.out.println("홍길동의 점수: " + scores.get("홍길동"));

        for (String name : scores.keySet()) {
            System.out.println(name + " : " + scores.get(name));
        }
    }
}
