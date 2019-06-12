package com.example.exception;

// 定义一个检查类
public class CheckingAccount {

    //balance 为余额 number 为卡号
    private double balance;
    private int number;

    public CheckingAccount(int number) {
        this.number = number;
    }

    // 存钱
    public void deposit(double amount){
        balance += amount;
    }

    //取钱
    public void withdraw(double amount) throws InsufficientFundsException {

        if (amount <= balance){
            balance -= amount;
        }else {
            double needs =amount - balance;
            throw new InsufficientFundsException(needs);
        }

    }

    // 返回余额

    public double getBalance(){
        return balance;

    }
    // 返回卡号
    public int getNumber(){
        return number;
    }



}
