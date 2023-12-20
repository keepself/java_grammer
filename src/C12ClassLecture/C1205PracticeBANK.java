package C12ClassLecture;

public class C1205PracticeBANK {
        public static void main(String[] args) {
            BankAccount BANKER = new BankAccount(234);
            BANKER.deposit(700);
            System.out.println(BANKER.getBalance());
            BANKER.withdraw(800);
            System.out.println(BANKER.getBalance());
            BANKER.withdraw(100);
            System.out.println(BANKER.getBalance());
            System.out.println(BANKER.getAccount_number());
    }
}
class BankAccount{
    private int account_number;
    private int balance;
//별도의 생성자를 만들지 않으면 매개변수없는 기본생성자가 숨겨져있다.
//생성자란 클래스 객체화 될때 자동으로 실행되는 메서드
//클래스명(){} : 생성자의 형태
     BankAccount(int account_number){
        this.account_number = account_number;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void withdraw(int b){
        if(balance>b) {
           balance = balance-b;
        }else {
            System.out.println("잔액이 부족합니다");
        }
    }
    public void deposit(int a){
      balance = balance + a;
    }

}

