// Qn 3. Show how to use a HashSet to store unique elements and how to handle duplicates. (5 Marks)
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Attempt to add a duplicate element
        boolean isAdded = set.add("Apple"); // returns false since "Apple" is a duplicate

        // Display the HashSet
        System.out.println("HashSet elements: " + set);

        // Check if the duplicate was added
        if (!isAdded) {
            System.out.println("\"Apple\" was not added again as it is a duplicate.");
        }
    }
}