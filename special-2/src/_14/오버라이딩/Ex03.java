package _14.오버라이딩;

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    // Object 클래스의 toString()을 재정의
    
}

public class Ex03 {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        System.out.println(p); // toString()이 자동으로 호출됨
        System.out.println("좌표: " + p.toString());
    }
}
