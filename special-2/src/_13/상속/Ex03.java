package _13.상속;

class Vehicle {
    protected int speed; // protected: 상속받은 클래스에서 접근 가능

    void move() {
        System.out.println(speed + "km/h로 이동합니다.");
    }
}



public class Ex03 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setSpeed(120);
        car.move();
    }
}
