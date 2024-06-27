package collections.primitives;

import java.util.ArrayList;

public class ListOperations {
    public static void listOperations() {

        // Initialize ArrayList
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        // Adding elements to list
        for (int i = 1; i <= 5; i++)
            integerArrayList.add(i);

        // Printing elements
        System.out.println("ArrayList is: " + integerArrayList);
        System.out.println("Checking if ArrayList is empty: " + integerArrayList.isEmpty());

        // Remove element at index 3
        integerArrayList.remove(3);
        System.out.println("ArrayList after removing element at index 3: " + integerArrayList);

        // Cloning the list
        Object clonedList = integerArrayList.clone();
        System.out.println("Cloned (Shallow copy) ArrayList is: " + clonedList);

        // Removing all elements in the list
        integerArrayList.clear();
        System.out.println("Clearing ArrayList: " + integerArrayList);

    }

    public static void main(String[] args) {
        listOperations();

    }

}
