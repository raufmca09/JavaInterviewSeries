package org.concepts;

public class ThreadLocalConcept {

    private static ThreadLocal<String> tlString = new ThreadLocal<>();

    public static void main(String args[]){

        Thread t1 = new Thread( () -> {
            tlString.set("Hello");
            System.out.println("Inside t1 with Hello");
        });

        Thread t2 = new Thread( () -> {
            tlString.set("World");
            System.out.println("Inside t2 with World");
        });

        t1.start();
        t2.start();
    }
}
