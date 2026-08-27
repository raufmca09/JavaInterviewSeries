package org.numbers;

public class Factorial {

    //2. recursive function

    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        return (num *factorial(num-1));
    }

    public static void main(String args[]){

        System.out.println("Factorial of 5 -> " + fact(5));
        System.out.println("Factorial of 1 -> " + fact(1));
        System.out.println("Factorial of 6 -> " + fact(6));

        System.out.println("Recursive method 5 is -> " + factorial(5));
    }

    //1. without recurrsive

    public static int fact(int num){
        int sum = 1;
        if(num == 1){
            return num;
        }

        for(int i=1; i <=num; i++){
            sum = sum * i;
        }

        return sum;
    }
}
