package linkedlistexercise;

import java.util.LinkedList;

//21Write a Java program to display the elements and their positions in a linked list
public class displayelementontheirposition {
    public static void main(String[] args) {
        LinkedList<String>houses=new LinkedList<>();
        houses.add("A1");
        houses.add("A2");
        houses.add("A3");
        houses.add("A4");
        houses.add("D1");
        houses.add("D2");
        houses.add("D3");
        houses.add("D4");
        System.out.println(houses);
        for(int i=0;i< houses.size();i++){
            System.out.println(" the element at index "+ i + ": " + houses.get(i));
        }

    }
}
