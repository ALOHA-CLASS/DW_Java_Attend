package _04.자료형;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println("int 범위: " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long 범위: " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("double 범위: " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);

        // 오버플로우 예시: 범위를 넘어서면 값이 깨짐
        int max = Integer.MAX_VALUE;
        System.out.println("오버플로우 예시: " + max + " + 1 = " + (max + 1));
    }
}
