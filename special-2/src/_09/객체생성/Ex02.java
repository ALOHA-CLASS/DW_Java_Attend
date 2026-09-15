package _09.객체생성;

class Fruit {
    String name;
    int price;
}

public class Ex02 {
    public static void main(String[] args) {
        // 객체를 담을 배열 생성 (초기값은 모두 null)
        Fruit[] fruits = new Fruit[3];

        // for ( 초기식 ; 조건식 ; 증감식 ) { }
        for (int i = 0; i < fruits.length; i++) {
            // 각 칸마다 실제 객체를 생성해서 넣어줌
            fruits[i] = new Fruit();
            fruits[i].name = "과일" + (i + 1);
            fruits[i].price = (i + 1) * 1000;
        }

        // foreach
        // - 배열 또는 컬렉션에 있는 모든 요소를 반복
        for (Fruit f : fruits) {
            System.out.println(f.name + " : " + f.price + "원");
        }
    }
}
