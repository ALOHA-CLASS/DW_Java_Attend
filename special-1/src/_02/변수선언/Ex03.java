package _02.변수선언;

public class Ex03 {
    public static void main(String[] args) {
        int x = 10; // main 메소드 안에서만 사용 가능한 지역변수
        System.out.println("main 의 x : " + x);
        showScope();
        System.out.println(x);
    }

    static void showScope() {
        // main의 x와는 다른 별개의 변수
        int x = 20;
        System.out.println("showScope 의 x : " + x);
    }
}
