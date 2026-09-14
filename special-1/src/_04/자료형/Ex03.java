package _04.자료형;

public class Ex03 {
    public static void main(String[] args) {
        // 묵시적 형변환 (작은 -> 큰 타입, 자동)
        int i = 100;
        double d = i; // int -> double 자동 변환
        System.out.println("묵시적 형변환: " + d);

        // 명시적 형변환 (큰 -> 작은 타입, (타입) 으로 강제 변환)
        double pi = 3.99;
        int truncated = (int) pi; // 소수점 버림
        System.out.println("명시적 형변환: " + truncated);

        // 문자열 <-> 숫자 변환
        String numStr = "123";
        int parsed = Integer.parseInt(numStr);
        String backToStr = String.valueOf(parsed);
        System.out.println("문자열->숫자: " + parsed + ", 숫자->문자열: " + backToStr);
    }
}
