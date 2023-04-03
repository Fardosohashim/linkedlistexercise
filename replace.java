package linkedlistexercise;

import java.util.LinkedList;
//16. Write a Java Program to Replace an Element in a LinkedList
public class replace {
    public static void main(String[] args) {
        LinkedList<String>colour=new LinkedList<>();
        colour.add("Red");
        colour.add("Green");
        colour.add("Black");
        colour.add("White");
        colour.add("Pink");
        System.out.println("Original linked list: " + colour);
        colour.set(1, "Orange");

        System.out.println("The value of second element changed. "+ colour);

    }
}
