package org.concepts;

public class Parent {

    public void start(){
        System.out.println("Inside start in PARENTS");
    }

    public static void main(String args[]){

        System.out.println( " INside main");
        Parent p = new Parent();
        p=null;

        System.gc();
    }

    public void finalize(){
        System.out.println("finalize");
    }
}
