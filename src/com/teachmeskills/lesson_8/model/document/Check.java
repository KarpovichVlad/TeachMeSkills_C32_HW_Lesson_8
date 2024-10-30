package com.teachmeskills.lesson_8.model.document;

import java.util.Date;

// TODO добавить поля: сумма перевода, дата перевода, номер счета или номер карты
// TODO создать метод для вывода информации о чеке на экран
public class Check {

    private double amount;
    private Date date;
    private String destination;

    public Check(double amount,Date date,String destination){
        this.amount = amount;
        this.date = date;
        this.destination = destination;
    }
    public void showCheckInfo(){
        System.out.println("Check - Amount: " + amount + ", Date: " + date + ", Destination: " + destination);
    }
}
