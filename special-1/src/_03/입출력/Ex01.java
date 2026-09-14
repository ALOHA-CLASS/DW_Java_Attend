package _03.입출력;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine(); // 한 줄 전체 입력
        System.out.println("안녕하세요, " + name + "님");
        sc.close();
    }
}
