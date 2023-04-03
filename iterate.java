package linkedlistexercise;

import java.util.LinkedList;
// Write a Java Program to Iterate through all Elements in a LinkedList
public class iterate {
    public static void main(String[] args) {
        LinkedList<String>phones=new LinkedList<>();
        phones.add("Samsung");
        phones.add("iphone14");
        phones.add("samsungA20");
        phones.add("infinix");
        phones.add("Oppo");
        phones.add("Realme");
        phones.add("Techno");
        phones.add("Huawei");
        phones.add("iphone 6");
        phones.add("ipad");
        for (String i:phones) {
            System.out.println(i);
        }

    }
}
