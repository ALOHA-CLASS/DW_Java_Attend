package _05.조건문;

public class Ex04 {
    public static void main(String[] args) {
        int number = 7;

        // 삼항 연산자: (조건) ? 참일 때 값 : 거짓일 때 값
        String result = (number % 2 == 0) ? "짝수" : "홀수";
        System.out.println(number + "은(는) " + result + "입니다.");

        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("최댓값: " + max);


        
    }
}
