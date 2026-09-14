package _04.자료형;

public class Ex01 {
    public static void main(String[] args) {
        byte b = 127;               // 1바이트: -128 ~ 127
        short s = 32000;            // 2바이트
        int i = 2_000_000_000;      // 4바이트 (가장 많이 사용)
        long l = 9_000_000_000L;     // 8바이트, L 접미사 필수

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
    }
}
