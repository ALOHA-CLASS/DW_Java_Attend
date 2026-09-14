package _03.입출력;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름과 점수를 입력하세요 (예: 홍길동 95): ");
        String name = sc.next();
        int score = sc.nextInt();

        // printf: 서식 문자열을 이용한 출력 (%s 문자열, %d 정수, %f 실수, %n 줄바꿈)
        System.out.printf("이름: %s, 점수: %d점%n", name, score);
        sc.close();
    }
}
