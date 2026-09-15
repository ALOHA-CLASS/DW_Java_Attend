package _09.객체생성;

class Point {
    int x, y;
}

public class Ex03 {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 2;

        Point p2 = p1;                  // p2는 p1과 같은 객체를 가리킴 (참조 복사)
        Point p3 = new Point();         // p3는 새로 생성된 별개의 객체
        p3.x = 1;
        p3.y = 2;
        
        p2.x = 100;             // p2를 바꾸면 p1도 같이 바뀜 (같은 객체이므로)

        System.out.println("p1.x = " + p1.x); // 100
        System.out.println("p1 == p2 : " + (p1 == p2)); // true, 같은 객체
        System.out.println("p1 == p3 : " + (p1 == p3)); // false, 다른 객체
    }
}
