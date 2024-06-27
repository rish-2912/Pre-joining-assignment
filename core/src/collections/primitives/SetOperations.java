package collections.primitives;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void setOperations() {

        // List of even integers
        ArrayList<Integer> li1 = new ArrayList<Integer>();
        for (int i = 2; i <= 10; i += 2) {
            li1.add(i);
        }

        // List of odd integers
        ArrayList<Integer> li2 = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i += 2) {
            li2.add(i);
        }

        Set<Integer> setA = new HashSet<Integer>();
        setA.addAll(li1);

        Set<Integer> setB = new HashSet<Integer>();
        setB.addAll(li2);

        // To find union
        Set<Integer> union = new HashSet<Integer>(setA);
        union.addAll(setB);
        System.out.println("Union of the two Set: " + union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection of the two Set: " + intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(setA);
        difference.removeAll(setB);
        System.out.println("Difference of the two Set: " + difference);

        // Removing element from set
        setA.remove(4);
        System.out.println("Set A after removing element 4 is: " + setA);

        // Checking if element is present in a set
        System.out.println("Checking if element 0 is present in Set A: " + setA.contains(9));

    }

    public static void main(String[] args) {
        setOperations();

    }

}
