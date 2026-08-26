package org.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class ArrayListConcept {

    public static void main(String args[]){
        System.out.println("Inside arraylist concept ");

        ArrayList ar = new ArrayList();
        ar.add(10);

        System.out.println(ar.size());
        ar.add(("20"));
        ar.add(30.30);
        ar.add('F');

        System.out.println(ar.size());

        // Using class

        Employee e1 = new Employee(28,"John", "IT");
        Employee e2 = new Employee(38,"Jose", "QA");
        Employee e3 = new Employee(42,"Albert", "Dev");

        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);

        System.out.println(emp.get(0)); // this will print the memory location

        // to print the details
        Iterator<Employee> it = emp.iterator();

        while(it.hasNext()){
            Employee emp1 = it.next();
            System.out.println(emp1.name + " -- " + emp1.age + " -- " + emp1.dept);
        }

        ArrayList<String> arS = new ArrayList<>();
        arS.add("Hello");
        arS.add("World");
        arS.add("Welcome");

        System.out.println(arS);

        // using lambda version
        System.out.println( " for each ");
        arS.forEach(names -> {
            System.out.println(names);
        } );

        System.out.println("===== Using for loop ");
        for(int i=0; i< arS.size(); i++){
            System.out.println(arS.get(i));
        }

        System.out.println("================= initializing the arrayList");

        ArrayList<Integer> obj = new ArrayList<Integer>(Arrays.asList(10,30,50,60));
        System.out.println("Size of -> " + obj.size() + " Elements are -> " + obj);

    }
}