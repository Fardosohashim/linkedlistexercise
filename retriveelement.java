package linkedlistexercise;

import java.util.LinkedList;
// 11 . Write a Java Program to Retrieve but does not Remove, the Last Element of a LinkedList.
public class retriveelement {
    public static void main(String[] args)
    {
        LinkedList<String> fruit = new LinkedList<> ();
        fruit.add("Guava");
        fruit.add("Papaya");
        fruit.add("Mulberry");
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Cherry");
        fruit.add("Watermelon");
        fruit.add("Pineapple");
        System.out.println("The given Linked List : " + fruit);
        String x = fruit.peekLast();
        System.out.println("Last Element in the List : " + x);
        System.out.println("Original Linked List : " + fruit);
    }
}
