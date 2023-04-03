package linkedlistexercise;

import java.util.Iterator;
import java.util.LinkedList;

// Write a Java Program to Iterate through all Elements in a LinkedList starting at the specified position
public class iteratingallelement {
    public static void main(String[] args) {
        LinkedList<String> book_list = new LinkedList<>();
        book_list.add("Java");
        book_list.add("C");
        book_list.add("C++");
        book_list.add("Python");
        book_list.add("Php");
        book_list.add("Css");
        book_list.add("Html");
        book_list.add("MySql");
        Iterator b = book_list.listIterator(1);
        while (b.hasNext()) {
            System.out.println(b.next());
        }
    }
}