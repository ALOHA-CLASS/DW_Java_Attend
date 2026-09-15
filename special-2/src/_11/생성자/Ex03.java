package _11.생성자;

class Pizza {
    String dough;
    String topping;

    Pizza() { // 기본 생성자
       
    }

    Pizza(String topping) { // 토핑만 지정하는 생성자
        
    }

    Pizza(String dough, String topping) { // 도우와 토핑을 모두 지정하는 생성자
       
    }

    void printInfo() {
        System.out.println(dough + " + " + topping);
    }
}

public class Ex03 {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza("불고기");
        Pizza p3 = new Pizza("고구마도우", "고구마");

        p1.printInfo();
        p2.printInfo();
        p3.printInfo();
    }
}
