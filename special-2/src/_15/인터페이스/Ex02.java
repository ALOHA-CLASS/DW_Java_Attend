package _15.인터페이스;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// 자바는 클래스 다중 상속은 안되지만, 인터페이스는 여러 개 구현 가능

public class Ex02 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
