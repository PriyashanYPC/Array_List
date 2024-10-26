package ArrayListOperations; // Ensure this is at the top of the file

import java.util.ArrayList;

public class ArrayListOperations {

    // Method to remove odd numbers from the list and print remaining numbers
    public void removeOddNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        System.out.println("After removing odd numbers: " + evenNumbers);
    }

    // Method to double even numbers from the list and print the new values
    public void doubleEvenNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> doubledEvenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                doubledEvenNumbers.add(number * 2);
            }
        }
        System.out.println("Doubled even numbers: " + doubledEvenNumbers);
    }
}
