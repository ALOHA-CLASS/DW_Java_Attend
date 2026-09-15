package _10.객체사용;

class Account {
    String owner;       // 예금주
    int balance;        // 잔액

    // 입금
    void deposit(int amount) {
        // balance = balance + amount;
        balance += amount;
        // 복합 대입 연산자 : A += B    --->  A = A + B
        System.out.println(amount + "원 입금. 현재 잔액 : " + balance + "원");
    }

    // 출금
    void withdraw(int amount) {
        // 출금액이 잔액보다 크다
        if( amount > balance ) {
            System.out.println("잔액이 부족합니다.");    
            return;         // 1. 메소드 종료  2. 값을 호출한 자리로 반환
        }
        // balance = balance - amount;
        balance -= amount;
        System.out.println(amount + "원 출금. 현재 잔액 : " + balance + "원");
    }
}

public class Ex01 {
    public static void main(String[] args) {
        Account account = new Account();
        account.owner = "홍길동";
        account.balance = 10000;

        account.deposit(5000);
        account.withdraw(3000);
        account.withdraw(50000); // 잔액 부족 테스트
    }
}
