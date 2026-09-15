package _11.생성자;

class Book {
    String title;
    int price;

    // 매개변수를 받는 생성자: 객체 생성과 동시에 필드 초기화
    
}

public class Ex01 {
    public static void main(String[] args) {
        // new Book(); // 매개변수 생성자만 있으면 기본 생성자는 자동으로 사라짐
        Book book = new Book("자바의 정석", 30000);
        System.out.println(book.title + " : " + book.price + "원");
    }
}
