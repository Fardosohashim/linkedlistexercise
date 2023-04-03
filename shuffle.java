package linkedlistexercise;

import java.util.Collections;
import java.util.LinkedList;
//26. Write a Java program to shuffle the elements in a linked list
public class shuffle {
    public static void main(String[] args) {
        LinkedList<String>shape=new LinkedList<>();
        shape.add("Square");
        shape.add("triangle");
        shape.add("rectangle");
        shape.add("circle");
        shape.add("cylinder");
        shape.add("trapezium");
        shape.add("Parallelogram");
        shape.add("isosceles");
        shape.add("oval");
        shape.add("sphere");
        System.out.println("before shuffle:"+ shape);
        Collections.shuffle(shape);
        System.out.println("After shuffle:"+shape);

    }
}
