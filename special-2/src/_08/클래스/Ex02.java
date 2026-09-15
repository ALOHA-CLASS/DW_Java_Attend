package _08.클래스;

class Student {
    // 이름, 학년, 점수
    String name;
    int grade;
    double score;

    // 메소드
    // * void : 반환할 값이 없음을 의미
    void introduce() {
        System.out.println(grade + "학년 " + name + "입니다.");
        System.out.println("점수는" + score + "점입니다.");
    }
    
    boolean isPassed() {
        return score >= 60; // >= 은 비교연산자로 논리값 true, false 를 반환한다.
    }
   
}

public class Ex02 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "김철수";
        s.grade = 2;
        s.score = 85.5;

        s.introduce();
        System.out.println("합격 여부: " + s.isPassed());
    }
}
