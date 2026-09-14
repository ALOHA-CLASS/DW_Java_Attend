package _06.반복문;

public class Ex04 {
    public static void main(String[] args) {
        // 중첩 반복문: 구구단 2~4단
        for (int dan = 2; dan <= 4; dan++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
            System.out.println("------");
        }

        // break: 반복문 즉시 종료
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.println("break 예제: " + i);
        }

        // continue: 이번 반복만 건너뛰고 다음 반복으로
        for (int i = 1; i <= 5; i++) {
            if (i == 3) continue;
            System.out.println("continue 예제: " + i);
        }
    }
}
