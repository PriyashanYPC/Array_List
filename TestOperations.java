package ArrayListOperations; // Ensure this is at the top of the file

import java.util.ArrayList;
import java.util.Scanner;

public class TestOperations {

    public static void main(String[] args) {
        // Create a Scanner to accept input from the user
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store user-entered integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Accept 5 integer values from the user
        System.out.println("Enter 5 integers: ");
        for (int i = 0; i < 5; i++) {
            numbers.add(scanner.nextInt());
        }

        // Create an instance of ArrayListOperations to call the methods
        ArrayListOperations operations = new ArrayListOperations();

        // Call the method to remove odd numbers
        operations.removeOddNumbers(numbers);

        // Call the method to double even numbers
        operations.doubleEvenNumbers(numbers);

        // Close the scanner
        scanner.close();
    }
}
