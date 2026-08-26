package org.abs;

public class BMW implements Car{
    @Override
    public void start() {
        System.out.println("BMW Starting");
    }

    @Override
    public void stop() {
        System.out.println("BMW stopping");
    }

    @Override
    public void refuel() {
        System.out.println("BMW refueling");
    }
}
