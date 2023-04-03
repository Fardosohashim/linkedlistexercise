package linkedlistexercise;

import java.util.LinkedList;

//14Write a Java Program to Compare Two LinkedList
public class comparetwolinkedlist {
    public static void main(String[] args) {
        LinkedList<String> b1 = new LinkedList<>();
        b1.add("Java");
        b1.add("C");
        b1.add("Cpp");
        b1.add("Python");
        b1.add("Php");
        System.out.println(b1);
        LinkedList<String> b2 = new LinkedList<>();
        b2.add("Cpp");
        b2.add("Html");
        b2.add("Php");
        b2.add("MySql");
        System.out.println(b2);
        LinkedList<String> b3 = new LinkedList<>();
        for (String e : b1)
        {
            b3.add(b2.contains(e) ? "Yes" : "No");
        }
        System.out.println(b3);
    }

}
