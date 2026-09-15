package _10.객체사용;

class Rectangle {
    int width;
    int height;

    int getArea() {
        return width * height;
    }
}

public class Ex03 {
    public static void main(String[] args) {
        Rectangle r = createRectangle(5, 10);
        System.out.println("넓이: " + r.getArea());
    }

    // 새 객체를 만들어서 반환하는 메소드
    static Rectangle createRectangle(int w, int h) {
        Rectangle rect = new Rectangle();
        rect.width = w;
        rect.height = h;
        return rect;
    }
}
