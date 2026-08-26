package org.abs;

public class TestAbstract {

    public static void main(String args[]){

        HDFCBank hb = new HDFCBank();
        hb.credit();
        hb.debit();
        hb.loan();
        hb.funds();

        // Patrent class reference

       // Bank b = new Bank(); Not allowed to create abstrct class object
        Bank b = new HDFCBank();
        b.credit();
        b.debit();
        b.loan();
        //b.funds() not allowed as its child class method


        BMW bmw = new BMW();
        bmw.start();
        bmw.stop();
        bmw.refuel();
    }
}
