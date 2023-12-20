package BankService;

public class BankAccount {
    private int account_number;
    private int balance;
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
}
