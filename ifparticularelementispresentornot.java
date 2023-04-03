package linkedlistexercise;

import java.util.LinkedList;

// 12. Write a Java Program to Check if a Particular Element exists in a LinkedList
public class ifparticularelementispresentornot {
    public static void main(String[] args) {
        LinkedList<String> Clothes = new LinkedList<>();
        Clothes.add("Dress");
        Clothes.add("trouser");
        Clothes.add("Scarf");
        Clothes.add("Shirt");
        Clothes.add("diraa");
        Clothes.add("Skirt");
        Clothes.add("tie");
        Clothes.add("Hijab");
        // contains() method checks whether the element exists
        if (Clothes.contains("Skirt")) {
            System.out.println("Element Skirt is present in List");
        } else {
            System.out.println("List doesn't have element Skirt");
        }

        //Checking for element
        if (Clothes.contains("suit")) {
            System.out.println("Element suit is present in List");
        } else {
            System.out.println("List doesn't have element suit");
        }
    }
}