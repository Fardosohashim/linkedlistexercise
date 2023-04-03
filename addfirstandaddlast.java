package linkedlistexercise;

import java.util.LinkedList;

public class addfirstandaddlast {
    public static void main(String[] args) {
        LinkedList<String> month=new LinkedList<>();
        month.add("January");
        month.add("febuary");
        month.add("march");
        month.add("April");
        month.add("may");
        month.add("june");
        month.add("july");
        month.add("August");
        month.add("september");
        month.add("October");
        month.add("November");
        month.add("December");
        System.out.println("Original linked list " +month);

        Object first_element = month.getFirst();
        System.out.println("First Element is: "+first_element);

        Object last_element = month.getLast();
        System.out.println("Last Element is: "+last_element);
    }
}
