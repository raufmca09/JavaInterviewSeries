package org.strings;

import java.util.HashMap;
import java.util.Map;

public class ReportSecondHighestReportingCharacter {

    public static void main (String args[]){
        String input = "Hithisisabdulroufdoingjavaprogramsandjavaprograms";

        char arr[] = input.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(char c: arr){
            if( map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int high = Integer.MIN_VALUE;
        int secondHigh = Integer.MIN_VALUE;


// Find highest and second highest frequency
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int freq = entry.getValue();
            if(freq > high){
                secondHigh = high;
                high = freq;
            } else if ( freq > secondHigh && freq < high){
                secondHigh = freq;
            }
        }
        System.out.println(map.toString());
// find the key for the same
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if( entry.getValue() == secondHigh){
                System.out.println("Second Higest -> " + entry.getKey());
                break;
            }
        }

    }
}
