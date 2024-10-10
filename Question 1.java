// Qn.1  Demonstrates how to create, add, remove, and access elements in an ArrayList (5 Marks)

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();
        
        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        
        // Access elements in the ArrayList
        System.out.println("First element: " + list.get(0)); // Accessing element at index 0
        System.out.println("Second element: " + list.get(1)); // Accessing element at index 1
        
        // Remove an element from the ArrayList
        list.remove("Banana"); // Removes "Banana"
        
        // Print updated ArrayList
        System.out.println("Updated ArrayList: " + list);
    }
}