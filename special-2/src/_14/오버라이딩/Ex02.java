package _14.오버라이딩;

class Shape {
    double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius = 5;

   
}

class Square extends Shape {
    double side = 4;

    
}

public class Ex02 {
    public static void main(String[] args) {
        // 부모 타입(Shape) 변수로 여러 자식 객체를 다룰 수 있음 (다형성)
        Shape[] shapes = { new Circle(), new Square() };

        for (Shape shape : shapes) {
            System.out.println("넓이: " + shape.getArea());
        }
    }
}
