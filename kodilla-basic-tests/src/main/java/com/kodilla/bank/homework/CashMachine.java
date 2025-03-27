package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;//tablica z transakcjami
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public int [] getTransactions (){
        return transactions;
    }
    public int getSize(){
        return size;
    }

    //tworzenie nowej tablicy i dodawania transakcji
    public void addTransaction (int count) {
        size ++;
        int [] newTransaction = new int[this.size];
        System.arraycopy(transactions,0, newTransaction, 0,transactions.length);
        newTransaction [this.size - 1]= count; //dodanie nowej transakcji
        this.transactions = newTransaction;
    }

    //saldo bankomatu
    public double accountBalance() {
        if (transactions.length == 0){
            return 0;
        }
        double sum = 0;
        for (int i = 0; i< transactions.length; i++) {
            sum = sum + transactions [i];
        }
        return sum;

    }
    //ilość transakcji
    public int transactionNumber() {
        return transactions.length;
    }

    //liczba transakcji zwiazana z wpłatą
    public int getDepositTransactionNumber (){
        int number = 0;
        for (int i=0; i< transactions.length; i++) {
            if(transactions [i] > 0) {
                number ++;
            }
        }
        return number;
    }

    //liczba transakcji związana z wypłatą
    public int getWithdrawalTransactionNumber (){
        int number = 0;
        for (int i=0; i<transactions.length; i++){
            if (transactions[i] < 0) {
                        number ++;
            }
        }
        return number;
    }

    //średnia wartość wpłat
    public double getAverageDeposit () {
        double sum = 0;
        int count = 0; //ilość wpłat
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                sum = sum + transactions[i];
                count++;
            }
        }
            if (count == 0) {
                return 0;
            }
            else {
                return sum / count;
            }
            //z początku miałam podzielone przez transaction.lengt,
            // ale wtedy chyba tez brałoby pod uwagę wypłaty..? czy nie jeśli w warunku mam if (transactions [i] >0)?

    }

        //średnia wartość wypłat
        public double getAverageWithdrawal () {
            double sum = 0;
            int count = 0; //wypłaty
            for (int i = 0; i < transactions.length; i++) {
                if (transactions[i] < 0) {
                    sum = sum + transactions[i];
                    count++;
                }
            }
            if (count == 0) {
                return 0;
            } else {
                return sum / count;
            }
        }
    }

