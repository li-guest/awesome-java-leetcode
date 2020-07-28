package com.blankj.ADT;

/**
 * @Author: Edward Gavin
 * @Create: 2020-07-06 09:56
 */
public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account("abc", 0);
        Deposit deposit = new Deposit(account);
        new Thread(deposit).start();
        new Thread(deposit).start();
    }
}

class Account{
    public String name;
    public int balance;

    public Account(String name, int balance) {
        super();
        this.balance = balance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void saveMoney(int money){
        balance += money;
    }

    public void getMoney(int money) {
        balance -= money;
    }
}

class Deposit implements Runnable{

    private Account account;
    public Deposit(Account account){
        this.account = account;
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (this){
                account.saveMoney(1000);
                System.out.println("balance:" +account.balance);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}