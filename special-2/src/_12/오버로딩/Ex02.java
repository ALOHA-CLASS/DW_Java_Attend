package _12.오버로딩;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println(add(1, 2));       // int 버전 호출
        System.out.println(add(1.5, 2.5));   // double 버전 호출
        System.out.println(add("Hello, ", "World")); // String 버전 호출
    }

    // 매개변수의 타입이 다르면 오버로딩 성립
    
}
