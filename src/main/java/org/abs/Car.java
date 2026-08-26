package org.abs;

public interface Car {
    // Only abstract methods
    // no abstract key word requiered
    // no method body allowed only method declaration
    // 100% abstraction no business logic ( Blue print )
    // cannot create the object of interface
    //only final and static variables are allowed to define

    int wheel = 4;


    public void start();
    public void stop();
    public void refuel();
}
