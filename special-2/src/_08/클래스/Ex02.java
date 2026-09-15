package _08.클래스;

class Student {
    
   
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
