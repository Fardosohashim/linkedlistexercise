package linkedlistexercise;

import java.util.LinkedList;
//24. Write a Java program to remove all the elements from a linked list
public class removingAll {
    public static void main(String[] args) {
            LinkedList<Integer> mynum=new LinkedList<>();
            mynum.add(0);
            mynum.add(10);
            mynum.add(90);
            mynum.add(17);
            mynum.add(20);
            System.out.println(" before removing: "+mynum);
            mynum.removeAll(mynum);
            System.out.println("After removing: "+mynum);

        }
    }

