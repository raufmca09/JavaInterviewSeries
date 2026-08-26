package org.collection;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {

    public static void main(String args[]){

        ArrayList<String> pgms = new ArrayList<String>(Arrays.asList("Java","Python","C","JS","C#"));

        System.out.println("Array size -> "+ pgms.size() + " --  Elements -> " + pgms);

        System.out.println( " Does the array contains 'java' -> " + pgms.contains("Java"));
        System.out.println(" Does the array contains 'R-Programs -> " + pgms.contains("R-Pgm"));

        System.out.println("What is the index of C -> " + pgms.indexOf("C"));

        System.out.println( "=========================================================");

        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Given Array -> " + nums);

        nums.removeIf(num -> num%2 ==0 );
        System.out.println("Array after removing even numbers " + nums);
    }
}
