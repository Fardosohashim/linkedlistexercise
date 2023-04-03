package linkedlistexercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

// Write a Java Program to Insert the Specified Element at the end of a LinkedList
public class endofelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> Apps = new LinkedList<>();
        System.out.println("enter an App: ");
        String getApps= sc.next();
        Apps.add("Facebook");
        Apps.add("Instagram");
        Apps.add("messenger");
        Apps.add("Google");
        Apps.add("TikTok");
        Apps.add("WhatsApp");
        Apps.add("Youtube");
        Apps.add("Netflix");
        Apps.add("Github");
        System.out.println("before Removing: " + Apps);



        Iterator<String> it = Apps.iterator();

    while(it.hasNext()){
        String i= it.next();

         if( getApps.equalsIgnoreCase(i)){
             it.remove();
             System.out.println(i);
        }
    }
        System.out.println(Apps);
    }

}
