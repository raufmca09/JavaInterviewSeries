package org.strings;

import java.util.*;

public class StringPrograms {

    public static void main(String args[]){

        String str = "The rains have started here";
        String str1 = "The rains have started here";

        //string operatinos
        System.out.println(str.length()); // to get the length - 27
        System.out.println(str.charAt(5)); // to get the charavter at 5 the index a
        System.out.println(str.indexOf("s")); // to get the first occurrance of s 8
        System.out.println(str.indexOf("s", str.indexOf("s")+1)); // index of s after first occurance 15
        System.out.println(str.indexOf("have")); // index of high
        System.out.println(str.indexOf("hello")); // returns -1

        // comparsion
        System.out.println(str.equals(str1)); //true
        System.out.println(str.equalsIgnoreCase(str1)); // compares with ignoring the case

        //substring
        System.out.println(str.substring(0,10));  // output : The rains

        //trim
        System.out.println("    Hello World     ".trim());

        //replace
        System.out.println("Hello World".replace(" ","")); //HelloWorld

        //split
        String test = "Hello_World_test_selenium_practice";
        String testsplit[] = test.split("_");
        System.out.println(Arrays.toString(testsplit));  // [Hello, World, test, selenium, practice]

        //concatinate
        System.out.println(str1.concat(str1)); // The rains have started hereThe rains have started here

        String input = "SAP Lab India";

        System.out.println(" Given string is -> "+input+ " Reversed -> " + reverseString(input));

        System.out.println( "--------------------------- ");

        System.out.println("Repeating word oooooooopppppppppppppeeeeeeeeeennnnnnnnn -> "+removeRepeatingCharacter("oooooooopppppppppppppeeeeeeeeeennnnnnnnn"));

        System.out.println(" Replace junk characters  你好嗎HelloIamgood你好嗎 -> " + removeJunkCharcter("你好嗎HelloIamgood你好嗎"));

        String names[] = {"Java","Ruby","Python", "Java", "C", "JS", "TS", "C"};
//        duplicateElement(names);
        //duplicEmlenetUsingSet(names);
        duplicateUsingMap(names);

    }

    public static String reverseString(String input){

        if(input.isEmpty() || input == null){
            return input;
        }
        StringBuilder rever = new StringBuilder();
        String str[] = input.split(" ");
        for(int i = str.length-1; i>=0; i--){
            rever.append(str[i]);
        }
        return  rever.toString();
    }

    public static String removeRepeatingCharacter(String input){

        if( input == null || input.isEmpty() ){
            return input;
        }

        StringBuilder result = new StringBuilder();

        char prevChar = input.charAt(0);
        result.append(prevChar);

        for(int i = 1; i< input.length(); i++){
            char currentChar = input.charAt(i);

            if(prevChar != currentChar){
                result.append(currentChar);
                prevChar = currentChar;
            }

        }
            return result.toString();
    }

    public static String removeJunkCharcter(String input){
        input = input.replaceAll("[^A-Za-z0-9]","");
        return input;
    }

    public static void duplicateElement(String... names){
        //comare each element O(n)2

        for(int i =0; i<names.length; i++){
            for(int j=i+1; j < names.length; j++){
                if(names[i].equals(names[j])){
                    System.out.println("Duplicate element is " + names[i]);
                }
            }
        }
    }

    public static void duplicEmlenetUsingSet(String names[]){
        Set<String> storage = new HashSet<String>();

        for(String name: names){
            if(storage.add(name) == false){
                System.out.println("Duplicate is -> " + name);
            }
        }
    }

    public static void duplicateUsingMap(String[] names){
        Map<String, Integer> map = new HashMap<String,Integer>();
        for(String name: names){
            if(map.containsKey(name)){
                map.put(name,map.get(name)+1);
            }else{
                map.put(name,1);
            }
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("Duplicate -> "+ entry.getKey());
            }
        }
    }
}
