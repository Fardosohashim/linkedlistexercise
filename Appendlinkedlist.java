package linkedlistexercise;

import java.util.LinkedList;
//Write a Java Program to Append the Specified Element to the end of a LinkedList
public class Appendlinkedlist {
    public static void main(String[] args) {
        LinkedList<String>names=new LinkedList<>();
        names.add("Abdifatah");
        names.add("Malyun");
        names.add("Ali");
        names.add("Abdi");
        names.add("Ahmed");
        names.add("nimo");

        System.out.println("the linked list: "+names);
        names.add("Najah");
        System.out.println(names);
        }
    }



