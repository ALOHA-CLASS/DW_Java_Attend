package _02.변수선언;

public class Ex02 {
    public static void main(String[] args) {
        // 변수명 규칙: 숫자로 시작 불가, 영문/한글/$/_ 로 시작 가능, 대소문자 구분
        int studentCount = 30;
        int student_count = 30;
        // 스네이크 케이스도 가능하지만 자바는 카멜케이스 권장

        // final: 한 번 값을 정하면 변경할 수 없는 상수
        final int MAX_SCORE = 100;
        System.out.println("최대 점수는 " + MAX_SCORE + "점입니다.");
        
        // MAX_SCORE = 90; // 컴파일 에러! final 변수는 재할당 불가
    }
}
