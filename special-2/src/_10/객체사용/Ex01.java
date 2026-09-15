package _10.객체사용;

class Account {
    String owner;
    int balance;

    void deposit(int amount) {

    }

    void withdraw(int amount) {
        
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
