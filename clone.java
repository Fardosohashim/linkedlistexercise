package linkedlistexercise;

import java.util.LinkedList;

public class clone {
    public static void main(String[] args) {

    LinkedList<Integer> number = new LinkedList<>();

        number.add(10);
        number.add(19);
        number.add(12);
        System.out.println("ArrayList: " + number);

LinkedList<Integer>i=new LinkedList<>();
       i=(LinkedList) number.clone();
        System.out.println("the clone linked list is : " +i);

}
}