package org.numbers;

import java.util.HashMap;
import java.util.Map;

public class CheckMycode {

    public static void main(String args[]){

        System.out.println("My First Line");

        System.out.println("Is 13 prime ? " + isPrime(13));
        System.out.println(" 121 is palindrom number " + isPalindrom(121));

        int arr[] = {4,2,6,7,2,4,9,8,4,6,9,7};

        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();

        for(int i : arr){

            if(hm.containsKey(i)){
                    hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }

        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(entry.getValue() <=1 ){
                System.out.println("Lone element is "+ entry.getKey());
            }
        }

        System.out.println("Total frequencies -> " + hm.toString());


    }

    public static boolean isPrime(int num){

        if(num <=1 ){
            return true;
        }

        for(int i =2; i < num/2; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrom(int num){
        if(num <= 1){
            return true;
        }

        int temp = num;
        int rev = 0, rem = 0;
        while(num != 0){
            rem = num % 10;
            rev = rev * 10 +  rem;
            num = num / 10;
        }
        System.out.println(" Reversed number => "+rev);
        if (temp == rev){
            return true;
        }
        return false;
    }
}
