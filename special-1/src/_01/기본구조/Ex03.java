package _01.기본구조;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        printLine();        // 메소드 호출 (ctrl + .)
        printMessage("메소드를 호출하여 프로그램을 구성!");
        printLine();
        System.out.println("프로그램 종료!");
    }

    private static void printLine() {
        // 한 줄 삭제 : ctrl + shift + K
        System.out.println("----------------------------------");
    }

    static void printMessage(String message) {
        System.out.println(message);    
    }

}
