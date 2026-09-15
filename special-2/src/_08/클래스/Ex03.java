package _08.클래스;

class Box {
    int number;         // 기본값 0
    double price;       // 기본값 0.0
    boolean isEmpty;    // 기본값 false
    String label;       // 기본값 null
}

public class Ex03 {
    public static void main(String[] args) {
        // 객체를 생성만 하고 값을 넣지 않으면 필드는 자료형별 기본값을 가짐
        Box box = new Box();
        System.out.println("number: " + box.number);
        System.out.println("price: " + box.price);
        System.out.println("isEmpty: " + box.isEmpty);
        System.out.println("label: " + box.label);
    }
}
