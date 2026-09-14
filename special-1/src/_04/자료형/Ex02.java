package _04.자료형;

public class Ex02 {
    public static void main(String[] args) {
        float f = 3.14f;                // 4바이트 실수, f 접미사 필수
        double d = 3.141592;            // 8바이트 실수 (기본 실수형)
        char c = '가';                  // 2바이트 문자 하나
        boolean isPassed = true;        // 참/거짓

        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + isPassed);
    }
}
