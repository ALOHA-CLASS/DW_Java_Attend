package _13.상속;

class Animal {
    String name;

    void eat() {
        System.out.println(name + "가 먹이를 먹습니다.");
    }
}

// Dog는 Animal의 필드와 메소드를 그대로 물려받음 (상속)


public class Ex01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "바둑이";
        dog.eat();  // 부모(Animal)로부터 물려받은 메소드
        dog.bark(); // 자식(Dog)에서 새로 추가한 메소드
    }
}
