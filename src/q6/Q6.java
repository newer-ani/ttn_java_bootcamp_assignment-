package q6;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Q6 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("A");
        list.addLast("B");
        list.addLast("C");

        System.out.println("List: " + list);
        System.out.println("First: " + list.getFirst());  // A
        System.out.println("Last: " + list.getLast());    // C

        list.removeFirst();  // removes A
        list.removeLast();   // removes C

        System.out.println("After removal: " + list);    // [B]
        list.addFirst("A");
        System.out.println("Reverssed: " + list.reversed());

        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Adding elements at both ends
        set.addFirst("X");
        set.addLast("Y");
        set.addLast("Z");

        System.out.println("Set: " + set); // [X, Y, Z]

        // Accessing first and last
        System.out.println("First: " + set.getFirst()); // X
        System.out.println("Last: " + set.getLast());   // Z

        // Removing first and last
        set.removeFirst();  // removes X
        set.removeLast();   // removes Z

        System.out.println("After removals: " + set);   // [Y]
        set.addLast("W");
        System.out.println("Reversed : " + set.reversed()); // [Y]

    }
}
