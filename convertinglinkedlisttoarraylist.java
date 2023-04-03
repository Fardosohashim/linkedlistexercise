package linkedlistexercise;

import java.util.ArrayList;
import java.util.LinkedList;

//13.Write a Java Program to Convert a LinkedList to ArrayList.
public class convertinglinkedlisttoarraylist {
    public static void main(String[] args) {
        LinkedList<Integer> myprime=new LinkedList<>();
        myprime.add(2);
        myprime.add(3);
        myprime.add(5);
        myprime.add(7);
        myprime.add(9);
        myprime.add(11);
        myprime.add(13);
        System.out.println("The Linked List are: "+myprime);
        ArrayList<Integer> mynum=new ArrayList<>(myprime);
        for (int i:mynum) {
            System.out.println(i);

        }
    }

}
