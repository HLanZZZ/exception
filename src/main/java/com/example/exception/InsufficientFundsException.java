package com.example.exception;


// 自定义异常类 继承 Exception
public class InsufficientFundsException extends Exception {

    private double amount;

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
