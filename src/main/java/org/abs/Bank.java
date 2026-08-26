package org.abs;

public abstract class Bank {

    // Abstract ->  partial abstraction
    // hiding the implementation logic is called abstraction
    // Abstract class can have both abstract and non abstract methods
    // cannont create the object of abstract class

    int amt = 100;
    final int rate = 100;
    static int intrRate = 10;

    public void credit(){
        System.out.println("Inside bank credit");
    }

    public void debit(){
        System.out.println("Inside debit bank ");
    }

    public abstract void loan(); // abstract method
}
