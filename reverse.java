package linkedlistexercise;

import java.util.Iterator;
import java.util.LinkedList;
//Write a Java Program to Iterate a LinkedList in Reverse Order

public class reverse {
    public static void main(String[] args) {
        LinkedList<String>Animal=new LinkedList<>();
        Animal.add("Lion");
        Animal.add("Cat");
        Animal.add("Dog");
        Animal.add("Rat");
        Animal.add("Lice");
        Animal.add("Ant");
        Animal.add("Cub");
        Animal.add("Leopard");
        System.out.println("before reversing:"+Animal);
        Iterator<String>i= Animal.descendingIterator();
        System.out.println("After reversing: ");
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
