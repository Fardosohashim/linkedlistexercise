package linkedlistexercise;

import java.awt.print.Book;
import java.util.LinkedList;

//15. Write a Java Program to test an LinkedList is Empty or Not
public class emptyornot {
    public static void main(String[] args)
    {
        LinkedList<String> Books= new LinkedList<String>();
        Books.add("Book1");
       Books .add("book2");
        Books.add("book3");
        Books.add("Book4");
        Books.add("book5");
        Books.add("book6");
        System.out.println("Given linked list : " + Books);

        Books.removeAll(Books);
        System.out.println("After Remove all Elements in Linked list : "+Books);

        System.out.println("Check the above linked list is Empty or Not : "+Books.isEmpty());
    }
}
