/*
Name: Sudhanshu Shashikant Kulkarni
PRN: 23070126132
Batch: AIML B-3
*/

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        // Create UserInput object to handle user input
        UserInput input = new UserInput(); 

        // Create Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Display a welcome message
        System.out.println("Welcome to the Calculator Program!");
        
        // Get user's choice for the operation to perform
        int choice = input.getUserChoice();

        // Switch-case to handle different operations based on user's choice
        switch (choice) {

            case 1: // Addition
                // Get two numbers from the user
                int[] numbers = input.userInput();
                // Create Calculator object and perform addition
                Calculator calculator = new Calculator(numbers);
                System.out.println("Addition: " + calculator.addition());
                break;

            case 2: // Subtraction
                // Get two numbers from the user
                numbers = input.userInput();
                // Create Calculator object and perform subtraction
                calculator = new Calculator(numbers);
                System.out.println("Subtraction: " + calculator.subtraction());
                break;

            case 3: // Multiplication
                // Get two numbers from the user
                numbers = input.userInput();
                // Create Calculator object and perform multiplication
                calculator = new Calculator(numbers);
                System.out.println("Multiplication: " + calculator.multiplication());
                break;

            case 4: // Division
                // Get two numbers from the user
                numbers = input.userInput();
                // Create Calculator object and perform division
                calculator = new Calculator(numbers);
                System.out.println("Division: " + calculator.division());
                break;

            case 5: // Fibonacci Sequence
                // Ask user for the number of terms in the Fibonacci sequence
                System.out.println("Enter the number of terms:");
                int n = scan.nextInt();
                // Create Calculator object and generate Fibonacci sequence
                calculator = new Calculator(null);
                int[] fibonacci = calculator.fibonacci(n);
                System.out.println("Fibonacci Sequence:");
                // Print the Fibonacci sequence
                for (int num : fibonacci) {
                    System.out.print(num + " ");
                }
                break;

            case 6: // Sum of Array
                // Get an array from the user
                int[] array = input.userInputArray();
                // Create Calculator object and calculate sum of array
                calculator = new Calculator(null);
                System.out.println("Sum of Array: " + calculator.sumOfArray(array));
                break;

            case 7: // Mean of Array
                // Get an array from the user
                array = input.userInputArray();
                // Create Calculator object and calculate mean of array
                calculator = new Calculator(null);
                System.out.println("Mean of Array: " + calculator.meanOfArray(array));
                break;

            default:
                // Handle invalid choice
                System.out.println("Invalid choice.");
        }
    }
}
