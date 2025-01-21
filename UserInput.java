import java.util.*;

class UserInput {
    
    // Method to get two numbers from the user for operations like addition, subtraction, etc.
    int[] userInput() {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[2];

        // Prompt user to enter the first number
        System.out.println("Enter first number:");
        numbers[0] = scan.nextInt();

        // Prompt user to enter the second number
        System.out.println("Enter second number:");
        numbers[1] = scan.nextInt();

        // Return the numbers as an array
        return numbers;
    }

    // Method to get an array of integers from the user
    int[] userInputArray() {
        Scanner scan = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();
        int[] array = new int[size];

        // Prompt user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        // Return the array entered by the user
        return array;
    }

    // Method to display a menu and get the user's choice for which operation to perform
    int getUserChoice() {
        Scanner scan = new Scanner(System.in);

        // Display available options for the user
        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci Sequence");
        System.out.println("6. Sum of Array");
        System.out.println("7. Mean of Array");

        // Return the user's choice as an integer
        return scan.nextInt();
    }
}
