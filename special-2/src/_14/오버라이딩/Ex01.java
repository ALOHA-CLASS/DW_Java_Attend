package _14.오버라이딩;

class Animal {
    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Cat extends Animal {
    // 부모의 메소드를 자식이 재정의(덮어씀)

    
}

public class Ex01 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();

        animal.sound();
        cat.sound(); // 오버라이딩된 메소드가 호출됨
    }
}
