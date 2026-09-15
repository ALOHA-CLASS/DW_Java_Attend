package _09.객체생성;

class Fruit {
    String name;
    int price;
}

public class Ex02 {
    public static void main(String[] args) {
        // 객체를 담을 배열 생성 (초기값은 모두 null)

        for (int i = 0; i < fruits.length; i++) {
               // 각 칸마다 실제 객체를 생성해서 넣어줌
        }

        for (Fruit f : fruits) {
            System.out.println(f.name + " : " + f.price + "원");
        }
    }
}
