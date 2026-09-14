package _03.입출력;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt(); // 정수 입력
        System.out.print("평균 점수를 입력하세요: ");
        double score = sc.nextDouble(); // 실수 입력
        System.out.println("나이: " + age + ", 평균 점수: " + score);
        sc.close();
    }
}
