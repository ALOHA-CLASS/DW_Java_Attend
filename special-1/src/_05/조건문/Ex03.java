package _05.조건문;

public class Ex03 {
    public static void main(String[] args) {
        int day = 3; // 1(월) ~ 7(일)
        String dayName;

        switch (day) {
            case 1: dayName = "월요일"; break;
            case 2: dayName = "화요일"; break;
            case 3: dayName = "수요일"; break;
            case 4: dayName = "목요일"; break;
            case 5: dayName = "금요일"; break;
            case 6: dayName = "토요일"; break;
            case 7: dayName = "일요일"; break;
            default: dayName = "잘못된 입력"; break;
        }

        System.out.println("오늘은 " + dayName + "입니다.");
    }
}
