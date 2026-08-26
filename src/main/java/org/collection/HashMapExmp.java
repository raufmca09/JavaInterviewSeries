package org.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExmp {

    public static void main(String args[]){
        //Hashmap is a class which implements Map interface
        // Extends Abstract map
        // It contains only unique elements
        // stores the values - Key, Value pair
        // it may have one null key and multiple null values
        // it maintains no order
        // non synchronized it fail for fail fast condition

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(1, "Selenium");
        hm.put(2, "QTP");
        hm.put(3, "Playwright");
        hm.put(4, "RFT");
        hm.put(4, "test complete");

        System.out.println(hm.get(2));
        System.out.println(hm.get(4));

      //  System.out.println(hm.remove(4));

        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey() + "--" + m.getValue());
        }

        System.out.println(hm);

        // one more object

        HashMap<Integer, Employee> emp = new HashMap<>();

        Employee e1 = new Employee(28,"John", "IT");
        Employee e2 = new Employee(38,"Jose", "QA");
        Employee e3 = new Employee(42,"Albert", "Dev");

        emp.put(1,e1);
        emp.put(2,e2);
        emp.put(3,e3);

        // traversing the hashmap

        for(Map.Entry m : emp.entrySet()){

          //  System.out.println(m.getKey() + " -- " + m.getValue());
            int key = (int)m.getKey();
            Employee e = (Employee) m.getValue();

            System.out.println(key + ")." + e.name + " -- " + e.age + " -- " + e.dept);
        }


    }
}
