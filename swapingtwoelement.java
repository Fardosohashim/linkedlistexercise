package linkedlistexercise;

import java.util.Collections;
import java.util.LinkedList;
//25.Write a Java program of swap two elements in a linked list

public class swapingtwoelement {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();
        names.add("Abdifatah");
        names.add("Malyun");
        names.add("Ali");
        names.add("Abdi");
        names.add("Ahmed");
        names.add("nimo");
        System.out.println("before swapping: " + names);
        Collections.swap( names ,0 , 5);
        System.out.println("After swapping" +names);
    }
}
