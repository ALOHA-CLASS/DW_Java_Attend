package _10.객체사용;

class Product {
    String name;
    int price;
}

public class Ex02 {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "노트북";
        product.price = 1200000;

        printProductInfo(product); // 객체를 메소드에 전달
        applyDiscount(product, 10); // 객체를 전달해서 필드를 변경
        printProductInfo(product);
    }

    static void printProductInfo(Product p) {
        System.out.println(p.name + " : " + p.price + "원");
    }

    // 객체는 참조로 전달되므로, 메소드 안에서 필드를 바꾸면 원본 객체도 바뀜
    static void applyDiscount(Product p, int percent) {
        p.price = p.price - (p.price * percent / 100);
    }
}
