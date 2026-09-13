package org.strings;

import java.util.HashMap;
import java.util.Map;

public class SecondLargestCharacterInString {

    public static void main(String[] args){

        String input = "aabbbccccddddddddeeeee";
        secondHighestCharacter(input);
    }

    public static void secondHighestCharacter(String input){
        //Step 1 convert the string to char array
        char charrArray[] = input.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        // Step 2 add each chacter with their frequency of repeating in map
        for(char c : charrArray){
            if ( map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        int highst = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        // Step 3. Check which is hight and second highest character
        for(int freq : map.values()){
            if( freq > highst){
                second = highst;
                highst = freq;
            } else if (freq > second && freq < highst){
                second = freq;
            }
        }

        //Step 4 get the character from the map matching with second hight frequency
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
                if(entry.getValue() == second){
                    System.out.println("Second Highst repeating Character -> "+ entry.getKey() + " its repeating " + second + " times");
                }
        }
    }
}
