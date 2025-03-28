package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuit {

    @Test //bilans z bankomatów
    public void shouldGetTotalBalans(){
        Bank bank = new Bank();
        CashMachine [] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(100);
        cashMachines[0].addTransaction(200);
        cashMachines[1].addTransaction(-300);
        cashMachines[2].addTransaction(100);
        cashMachines[2].addTransaction(50);

        assertEquals (150, bank.getTotalBalance(), 0.01);
    }

    @Test
    public void shouldBeZeroIfAreNotAnyTransactions (){
        Bank bank = new Bank();
        assertEquals(0, bank.getTotalBalance(), 0.01);
        assertEquals(0, bank.getTotalDepositTransactionNumber());
        assertEquals(0, bank.getTotalWithdrawalTransactionNumber());
        assertEquals(0, bank.getTotalAverageDeposit(),0.01);
        assertEquals(0, bank.getTotalAverageWithdrawal(),0.01);
    }

    @Test //liczba transakcji związana z wpłatą w bankomatach
    public void shouldBeZeroIfAreOnlyWithdrawalTransactions (){
        Bank bank = new Bank();
        CashMachine [] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(-200);
        cashMachines[1].addTransaction(-100);
        cashMachines[1].addTransaction(-200);

        assertEquals(0, bank.getTotalDepositTransactionNumber());
    }
    @Test
    public void shouldBeTotalDepositTransactionsNumberIfAreOnlyDepositTransactions (){
        Bank bank = new Bank();
        CashMachine [] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(200);
        cashMachines[1].addTransaction(100);
        cashMachines[1].addTransaction(200);

        assertEquals(3, bank.getTotalDepositTransactionNumber());
    }

    @Test
    public void shouldBeTotalDepositTransactionsNumberIfAreMixedTransactions() {
        Bank bank = new Bank();
        CashMachine [] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(200);
        cashMachines[1].addTransaction(-100);
        cashMachines[1].addTransaction(200);

        assertEquals(2, bank.getTotalDepositTransactionNumber());

    }

    @Test //liczba transakcji związana z wypłatą w bankomatach
    public void shouldBeZeroIfAreOnlyDepositTransactions (){
        Bank bank = new Bank();
        CashMachine [] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(200);
        cashMachines[1].addTransaction(100);
        cashMachines[1].addTransaction(200);

        assertEquals(0, bank.getTotalWithdrawalTransactionNumber());
    }

    @Test
    public void shouldBeTotalWithdrawalTransactionsNumberIfAreOnlyWithdrawalTransactions() {
        Bank bank = new Bank();
        CashMachine [] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(-200);
        cashMachines[1].addTransaction(-100);
        cashMachines[1].addTransaction(-200);

        assertEquals(3, bank.getTotalWithdrawalTransactionNumber());
    }

    @Test
    public void shouldBeTotalWithdrawalTransactionsNumberIfAreMixedTransactions() {
        Bank bank = new Bank();
        CashMachine [] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(200);
        cashMachines[1].addTransaction(-100);
        cashMachines[1].addTransaction(200);

        assertEquals(1, bank.getTotalWithdrawalTransactionNumber());
    }

    @Test //średnia wartość wpłaty w bankamatach
    public void TotalAverageDepositShouldBeZeroIfAreOnlyWithdrawalTransactions (){
        Bank bank = new Bank();
        CashMachine [] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(-200);
        cashMachines[1].addTransaction(-100);
        cashMachines[1].addTransaction(-200);

        assertEquals(0, bank.getTotalAverageDeposit(), 0.01);

    }

    @Test
    public void TotalAverageDepositShouldBeCalculatedIfAreOnlyDepositTransactions (){
        Bank bank = new Bank();
        CashMachine [] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(200);
        cashMachines[1].addTransaction(100);
        cashMachines[2].addTransaction(200);
        cashMachines[3].addTransaction(300);
        cashMachines[1].addTransaction(200);

        assertEquals(250, bank.getTotalAverageDeposit(),0.01);

    }

    @Test
    public void TotalAverageDepositShouldBeCalculatedIfAreMixedTransactions (){
        Bank bank = new Bank();
        CashMachine [] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(-200);
        cashMachines[1].addTransaction(100);
        cashMachines[2].addTransaction(200);
        cashMachines[3].addTransaction(300);
        cashMachines[1].addTransaction(-200);

        assertEquals(150, bank.getTotalAverageDeposit(),0.01);

    }

    @Test //średnia wartość wypłaty w bankomatach
    public void TotalAverageWithdrawalShouldBeZeroIfAreOnlyDepositTransactions (){
        Bank bank = new Bank();
        CashMachine [] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(200);
        cashMachines[1].addTransaction(100);
        cashMachines[1].addTransaction(200);

        assertEquals(0, bank.getTotalAverageWithdrawal(), 0.01);
    }

    @Test
    public void TotalAverageWithdrawalShouldBeCalculatedIfAreOnlyWithdrawalTransactions (){
        Bank bank = new Bank();
        CashMachine [] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(-200);
        cashMachines[1].addTransaction(-100);
        cashMachines[2].addTransaction(-200);
        cashMachines[3].addTransaction(-300);
        cashMachines[1].addTransaction(-200);

        assertEquals(-250, bank.getTotalAverageWithdrawal(),0.01);

    }



    @Test
    public void TotalAverageWithdrawalShouldBeCalculatedIfAreMixedTransactions (){
        Bank bank = new Bank();
        CashMachine [] cashMachines = bank.getCashMachines();
        cashMachines[0].addTransaction(-200);
        cashMachines[1].addTransaction(100);
        cashMachines[2].addTransaction(200);
        cashMachines[3].addTransaction(300);
        cashMachines[1].addTransaction(-200);

        assertEquals(-100, bank.getTotalAverageWithdrawal(),0.01);

    }

}
