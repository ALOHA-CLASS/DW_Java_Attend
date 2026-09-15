package _09.객체생성;

class Person {
    String name;
    int age;
}

public class Ex01 {
    public static void main(String[] args) {
        // new 키워드로 객체를 여러 개 생성할 수 있음 (각각 독립된 메모리 공간)
        

        System.out.println(p1.name + " (" + p1.age + "세)");
        System.out.println(p2.name + " (" + p2.age + "세)");
    }
}
