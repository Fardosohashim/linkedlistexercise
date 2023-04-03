package linkedlistexercise;

import java.util.LinkedList;

//20.Write a Java program to join two linked lists
public class joiningtwolinkedlist {
    public static void main(String[] args)
    {
        LinkedList<String> tv1 = new LinkedList <String> ();
        tv1.add("Samsung");
        tv1.add("LG");
        tv1.add("noble");
        tv1.add("smart tv");
        System.out.println("List of first linked list: " + tv1);

        LinkedList <String> tv2 = new LinkedList <> ();
        tv2.add("Cvl");
        tv2.add("xiamo tv");
        tv2.add("Vu tv");
        tv2.add("Sony tv");
        System.out.println("List of second linked list: " + tv2);

        LinkedList <String> a = new LinkedList <> ();
        a.addAll(tv1);
        a.addAll(tv2);
        System.out.println("New linked list: " + a);
    }
}
