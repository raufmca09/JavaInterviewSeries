package org.collection;

public class StringCheck {

    public static void main(String[] args ){

        String x = "abc";
        String y = "abc";

        System.out.println(x.concat(y));

        System.out.println(x);

        String result = Captialize("hello am from bangalore");
        System.out.println("After capitalize -> " + result);

        //swapping to strings without 3rd variable
        String a = "Hello";String b = "World";
        a= a+b;//HelloWorld
        b= a.substring(0,a.length()-b.length());
        a = a.substring(b.length());

        System.out.println("A -> " + a + " B -> " + b);

    }

    public static String Captialize(String str){
        String result = "";

        String[] words = str.split("\\s");

        for(String word: words){
            String first = word.substring(0,1).toUpperCase();
            String last = word.substring(1).toLowerCase();
            result = result+first+last;
        }
        return result.trim();
    }
}
