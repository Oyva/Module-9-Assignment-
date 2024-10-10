// Qn.4  Show how to use a HashMap to store key-value pairs and access them. (5 Marks)
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Step 2: Add key-value pairs to the HashMap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Step 3: Access values using the keys
        System.out.println("The value for Apple is: " + map.get("Apple"));
        System.out.println("The value for Banana is: " + map.get("Banana"));
        System.out.println("The value for Orange is: " + map.get("Orange"));
    }
}