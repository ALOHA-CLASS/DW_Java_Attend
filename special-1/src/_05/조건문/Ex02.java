package _05.조건문;

public class Ex02 {
    public static void main(String[] args) {
        int score = 85;
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }


        System.out.println("점수: " + score + ", 학점: " + grade);
    }
}
