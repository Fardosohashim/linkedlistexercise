package linkedlistexercise;

import java.util.LinkedList;

//22. Write a Java program to remove a specified element from a linked list
public class removingaspecificelement {
    public static void main(String[] args) {
        LinkedList<Integer> mynum=new LinkedList<>();
        mynum.add(0);
        mynum.add(10);
        mynum.add(90);
        mynum.add(17);
        mynum.add(20);
        System.out.println(" before removing: "+mynum);
        mynum.remove(90);
        System.out.println("After removing: "+mynum);

    }
}
