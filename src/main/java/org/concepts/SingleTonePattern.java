package org.concepts;

public class SingleTonePattern {

    //1. Private Static instance of the class

    private  static SingleTonePattern browser;

    //2. Private constructor to prevent/avoid instantation

    private SingleTonePattern(){

    }
    //3. Public static method to provide access to instance/object

    public static SingleTonePattern getInstance(){
        if( browser == null){
            return browser = new SingleTonePattern();
        }
        return browser;
    }
    //4. Individual method of the class

    public void displayMsg(){
        System.out.println("Inside display method in SingleTone class");
    }


}
