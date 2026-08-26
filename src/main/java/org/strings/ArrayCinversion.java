package org.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayCinversion {

    public static void main(String args[]){

        String[] arr = {"t", "r", "v"}; //trv or t;r;v; or t|r|v

        String join = String.join(";",arr);

        System.out.println(join);

        String join1 = Arrays.asList("t","r","y","i","n","g").stream().collect(Collectors.joining("!"));

        System.out.println(join1);

        System.out.println("Using String builder -> " + joinString("|", "hello", " my", " name", " is", " Abdul"));

    }

    public static String joinString(String operator, String... values){

        StringBuilder result = new StringBuilder();

        int end = 0;

        for(String s: values){
            result.append(s);
            end = result.length();
            result.append(operator);
        }
        return result.substring(0,end);
    }
}
