package _06.반복문;

public class Ex02 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
        
        // do-while은 조건과 상관없이 최소 1번은 실행됨
    }
}
