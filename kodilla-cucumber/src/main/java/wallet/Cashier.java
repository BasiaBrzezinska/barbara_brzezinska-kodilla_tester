package wallet;

public class Cashier {

    private final CashSlot cashSlot;

    public Cashier (CashSlot cashSlot){
        this.cashSlot = cashSlot;
    }

    public String withdraw (Wallet wallet, int amount){
        if (wallet.getBalance() < amount){
            cashSlot.dispense(0);
            return "You don't have enough money in your wallet";
        }
        else if (amount <= 0) {
            return "You can not withdrawal negative amount of money";
        }
        else {
            wallet.debit(amount);
            cashSlot.dispense(amount);
            return "You have withdraw : $" + amount;
        }

    }
}
