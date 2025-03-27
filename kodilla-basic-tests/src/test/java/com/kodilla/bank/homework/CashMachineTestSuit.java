package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuit {

    @Test
    public void shouldAddTwoTransactionsToArray (){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(250);
        cashMachine.addTransaction(-100);

        int[] transactions = cashMachine.getTransactions();
        assertEquals (2, transactions.length);
        assertEquals(250, transactions[0]);
        assertEquals(-100, transactions[1]);
    }

    @Test //saldo z bankomatu
    public void shouldReturnBalanceIfAddTransactions () {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-250);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(150);

        assertEquals(-500, cashMachine.accountBalance(), 0.01);
    }

    @Test
    public void shouldReturnZeroIfAreNotAnyTransactions (){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.accountBalance(), 0.01);
    }

    @Test //ilość transakcji jesli brak transacji
    public void shouldBeZeroIfIsNotAnyTransaction (){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.transactionNumber());
    }

    @Test
    public void shouldBeFourIfAddFourTransactions (){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-400);
        cashMachine.addTransaction(-200);

        assertEquals(4, cashMachine.transactionNumber());
    }

    @Test //liczba transakcji związanych z wpłatą
    public void shouldBeZeroIfAreNotAnyTransactions (){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getDepositTransactionNumber());
        assertEquals(0, cashMachine.getWithdrawalTransactionNumber());
    }

    @Test
    public void shouldBeZeroIfAreWithdrawalInsteadDeposit (){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-300);
        assertEquals(0, cashMachine.getDepositTransactionNumber());
    }

    @Test
    public void shouldBeAverageDepositTransactionsNumberIfAreVariousTransactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        assertEquals(2, cashMachine.getDepositTransactionNumber());
    }

    @Test
    public void shouldBeAverageDepositTransactionsNumberIfAreOnlyDepositTransactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(50);
        assertEquals(4, cashMachine.getDepositTransactionNumber());
    }


    @Test
    public void shouldBeZeroIfAreDepositInsteadWithdrawal(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(300);
        assertEquals(0, cashMachine.getWithdrawalTransactionNumber());
    }

    @Test
    public void shouldBeAverageWithdrawalTransactionsNumberIfAreVariousTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        assertEquals(2, cashMachine.getWithdrawalTransactionNumber());
    }

    @Test
    public void shouldBeAverageWithdrawalTransactionsNumberIfAreOnlyWithdrawalTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-50);
        assertEquals(4, cashMachine.getWithdrawalTransactionNumber());
    }

    @Test //Srednia wartość wpłat
    public void AverageShouldBeZeroIfAreNotAnyTransactionsCount (){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getAverageDeposit(), 0.01);
        assertEquals(0, cashMachine.getAverageWithdrawal(), 0.01); //od razu wypłaty

    }

    @Test
    public void AverageShouldBeZeroIfAreWithdrawalTransactionsOnly (){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(-100);
        assertEquals(0, cashMachine.getAverageDeposit(),0.01);

    }

    @Test
    public void shouldBeAverageDepositIfAreVariousTransactions (){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        assertEquals(150, cashMachine.getAverageDeposit(), 0.01);
    }

    @Test
    public void shouldBeAverageDepositIfAreOnlyDepositTransactions(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(200);
        assertEquals(200, cashMachine.getAverageDeposit(), 0.01);
    }

    @Test //średnia wartość wypłat
    public void AverageShouldBeZeroIfAreDepositTransactionsOnly () {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(100);
        assertEquals(0, cashMachine.getAverageWithdrawal(), 0.01);
    }

    @Test
    public void shouldBeAverageWithdrawalIfAreOnlyWithdrawalTransactions (){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(-50);
        assertEquals(-100, cashMachine.getAverageWithdrawal(), 0.01);
    }

    @Test
    public void shouldBeAverageWithdrawalIfAreVariousTransactions (){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(50);
        assertEquals(-150, cashMachine.getAverageWithdrawal(), 0.01);
    }

    }
