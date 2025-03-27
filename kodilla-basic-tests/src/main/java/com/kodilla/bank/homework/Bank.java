package com.kodilla.bank.homework;

import java.util.concurrent.Callable;

public class Bank {
    private CashMachine[] cashMachines ;

    public Bank (){
        this.cashMachines = new CashMachine[4];
        this.cashMachines[0] = new CashMachine();
        this.cashMachines[1] = new CashMachine();
        this.cashMachines[2] = new CashMachine();
        this.cashMachines[3]= new CashMachine();

    }
    public CashMachine[] getCashMachines (){
        return cashMachines;
    }


    //metoda zwracająca bilans z bankomatów
    public double getTotalBalance (){
        if (cashMachines.length == 0) {
            return  0;
        }
        double total = 0;
        for (int i =0; i< cashMachines.length; i++) {
            CashMachine mashine = cashMachines[i];
            total = total + mashine.accountBalance();
        }
       return total;
    }

    //liczba transakcji związanych z wypłatą,
    public int getTotalWithdrawalTransactionNumber (){
        int number = 0;
        for (int i =0; i< cashMachines.length; i++) {
            CashMachine machine = cashMachines [i];
            number = number + machine.getWithdrawalTransactionNumber();
        }
        return number;
    }

    //liczbę transakcji związaną z wpłatą
    public int getTotalDepositTransactionNumber () {
        int number = 0;
        for (int i = 0; i < cashMachines.length; i++){
            CashMachine machine = cashMachines [i];
            number= number + machine.getDepositTransactionNumber();
        }
        return number;
    }

    //średnia wartość wypłaty
    public double getTotalAverageWithdrawal (){
        double count = 0;
        for (int i = 0; i< cashMachines.length; i++){
            CashMachine machine = cashMachines [i];
            count= count + machine.getAverageWithdrawal();
                }
        return count;
            };

    //średnią wartość wpłaty.
    public double getTotalAverageDeposit (){
        double count = 0;
        for (int i = 0; i< cashMachines.length; i++){
            CashMachine machine = cashMachines [i];
            count = count + machine.getAverageDeposit();
        }
        return count;
    }
}


