package wallet;

public class Wallet {

    private int balance = 0;

    public Wallet(){

    }

    public String deposit (int money) {
        this.balance += money;
        return "You deposited $" + money;
    }

    public String debit(int amount) {
        this.balance -= amount;
        return "You have withdrawn $" + amount;
    }

    public int getBalance (){
        System.out.println("your balance is "+ balance);
        return balance;
    }
}
