// Qn. 5 Create a Generic Method. A generic method allows us to create a method that can work with any data type. (5 Marks)

public class GenericMethodExample {

    // Generic method that works with any type of array
    public static <T> void printArray(T[] inputArray) {
        // Display the elements of the array
        for (T element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        // Double array
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        // Character array
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        
        System.out.println("Integer Array:");
        printArray(intArray);   // Call generic method with Integer array

        System.out.println("Double Array:");
        printArray(doubleArray);  // Call generic method with Double array

        System.out.println("Character Array:");
        printArray(charArray);  // Call generic method with Character array
    }
}