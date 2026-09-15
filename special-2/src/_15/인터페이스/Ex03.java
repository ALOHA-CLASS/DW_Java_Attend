package _15.인터페이스;



public class Ex03 {
    public static void main(String[] args) {
        // 인터페이스 타입 변수로 서로 다른 구현체를 다룰 수 있음
        Payable[] payments = { new CardPayment(), new CashPayment() };

        for (Payable payment : payments) {
            payment.pay(10000);
        }
    }
}
