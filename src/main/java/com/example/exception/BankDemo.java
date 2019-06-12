package com.example.exception;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankDemo {

    @RequestMapping("/testDeadLock")
    public void  testBankException(){


        CheckingAccount account = new CheckingAccount(10086);
        account.deposit(10000);

        System.out.println("存钱 10000");

        try {
            account.withdraw(1000);
            System.out.println("取钱1000.00");

            account.withdraw(20000);
            System.out.println("取钱20000");
        }catch (InsufficientFundsException e){

            System.out.println("Sorry but you are short money"+e.getAmount());
            e.printStackTrace();

        }
        //存钱 10000
        //取钱1000.00
        //Sorry but you are short money11000.0
        //com.example.exception.InsufficientFundsException  报出异常


    }


}

