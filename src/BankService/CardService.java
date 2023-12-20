package BankService;

public class CardService implements BankService {
    @Override
    public void withdraw(int b, BankAccount entity) {
        System.out.println("카드 '출금' 서비스입니다.");
        if (entity.getBalance() > b) {
            entity.setBalance(entity.getBalance() - b);
        } else {
            System.out.println("잔액이 부족합니다");

        }
    }

    @Override
    public void deposit(int a, BankAccount entity) {
        System.out.println("카드 '입금' 서비스입니다.");
        entity.setBalance(entity.getBalance()+a);

    }
}
