package org.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapBasics {

    public static void main(String[] args){

        HashMap<String, String> capitalCity = new HashMap<String,String>();

        capitalCity.put("India", "New Delhi");
        capitalCity.put("Germany", "Berlin");
        capitalCity.put("Russai", "Moscow");
        capitalCity.put("US","WC");
        capitalCity.put("UK","London11");
        capitalCity.put("UK","London");

        System.out.println("Captial of Germany is -> " + capitalCity.get("Germany"));
        System.out.println("Capital of UK is -> " + capitalCity.get("UK")); // it fetches the latest value

        //iterator for keys

        System.out.println(" ------- Set of Keys ---------");
        Iterator<String> country = capitalCity.keySet().iterator();

        while(country.hasNext()){
            System.out.println(country.next());
        }

        System.out.println("--------- Get both Key and value set --------------");
        Iterator<Map.Entry<String,String>> itkv = capitalCity.entrySet().iterator();

        while(itkv.hasNext()){
            System.out.println(itkv.next());
        }

        System.out.println( " -----------the other way ");

  //      System.out.println(itkv.toString());
        // Display the same with other way

        while(itkv.hasNext()){
            Map.Entry<String,String> entry = itkv.next();
            System.out.println(entry.getKey() + " ------ " + entry.getValue());
        }

        // using lambda expressions

        System.out.println( " Using lambda expression ");
        capitalCity.forEach((k,v) -> System.out.println("Key -> "+k + " value -> "+v));
    }
}
