package _11.생성자;

class Member {
    String name;
    int age;

    Member(String name, int age) {
        // this.필드 = 매개변수: 필드명과 매개변수명이 같을 때 구분하기 위해 사용
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("이름: " + this.name + ", 나이: " + this.age);
    }
}

public class Ex02 {
    public static void main(String[] args) {
        Member m = new Member("김영희", 25);
        m.introduce();
    }
}
