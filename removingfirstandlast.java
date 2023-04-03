package linkedlistexercise;

import java.util.LinkedList;

//23. Write a Java program to remove first and last element from a linked list
public class removingfirstandlast {
    public static void main(String[] args) {
        LinkedList<Integer> mynum=new LinkedList<>();
        mynum.add(0);
        mynum.add(10);
        mynum.add(90);
        mynum.add(17);
        mynum.add(20);
        System.out.println(" before removing: "+mynum);
        mynum.removeFirst();
        mynum.removeLast();
        System.out.println("After removing: "+mynum);

    }
}
