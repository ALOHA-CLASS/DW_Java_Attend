package _08.클래스;

// 클래스: 객체를 만들기 위한 설계도. 필드(속성)와 메소드(기능)로 구성됩니다.
class Car {
    String model;       // 필드(속성)
    int speed;          // 필드(속성)

    // 메소드(기능)
    // 접근지정자 (static) 반환타입 메소드명( 매개변수 ) {  실행문; }
    void drive() {
        // sysout
        System.out.println(model + "가 " + speed + "km/h로 달립니다.");
    }

    
}

public class Ex01 {
    // main : 프로그램 시작점!
    public static void main(String[] args) {
        // * 객체 생성
        // 클래스타입  객체명 = new 클래스명();
        Car car = new Car();        // Car 클래스로 객체(인스턴스) 하나를 생성
        car.model = "소나타";
        car.speed = 100;
        car.drive();                // 메소드 호출
    }
}
