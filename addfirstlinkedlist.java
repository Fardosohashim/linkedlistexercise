package linkedlistexercise;

import java.util.LinkedList;
//Write a Java Program to Insert the Specified Element at the Front of a LinkedList
public class addfirstlinkedlist {
    public static void main(String[] args) {
        LinkedList<String> furniture=new LinkedList<>();
        furniture.add("bed");
        furniture.add("table");
        furniture.add("chairs");
        furniture.add("desk");
        furniture.add("cupboard");
        furniture.add("sofa");
        furniture.add("pillow");
        furniture.add("mattress");
        furniture.add("dress mirror");
        System.out.println("before"+ furniture);
        furniture.addFirst("carpet");
        System.out.println("After"+furniture);
    }
}
