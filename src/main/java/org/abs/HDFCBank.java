package org.abs;

public class HDFCBank extends Bank{

    @Override
    public void loan() {
        System.out.println("Overriden Loan method in HDFC Bank");
    }

    public void credit(){
        System.out.println("Inside HDFC Credit ");
    }

    public void debit(){
        System.out.println("Inside HFDC debit");
    }

    public void funds(){
        System.out.println(" Inside HDFC funds");
    }
}
