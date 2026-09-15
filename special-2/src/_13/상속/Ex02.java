package _13.상속;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("이름: " + name);
    }
}

class Teacher extends Person {
    
}

public class Ex02 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("김선생", "자바");
        teacher.introduce();
    }
}
