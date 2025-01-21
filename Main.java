/*
Name: Sudhanshu Shashikant Kulkarni
PRN: 23070126132
Batch: AIML B-3
*/
import java.util.Scanner;

class Main{

		public static void main(String[] args) {

        UserInput input = new userInput(); // UserInput object
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Calculator Program!");
        
        int choice = input.getUserChoice();

        switch (choice) {
            case 1: // Addition
                int[] numbers = input.userInput();
                Calculator calculator = new Calculator(numbers);
                System.out.println("Addition: " + calculator.addition());
                break;

            case 2: // Subtraction
                numbers = input.userInput();
                calculator = new Calculator(numbers);
                System.out.println("Subtraction: " + calculator.subtraction());
                break;

            case 3: // Multiplication
                numbers = input.userInput();
                calculator = new Calculator(numbers);
                System.out.println("Multiplication: " + calculator.multiplication());
                break;

            case 4: // Division
                numbers = input.userInput();
                calculator = new Calculator(numbers);
                System.out.println("Division: " + calculator.division());
                break;

                System.out.println("Enter the number of terms:");
                int n = scan.nextInt();
                calculator = new Calculator(null);
                int[] fibonacci = calculator.fibonacci(n);
                System.out.println("Fibonacci Sequence:");
                for (int num : fibonacci) {
                    System.out.print(num + " ");
                }
                break;

            case 6: // Sum of Array
                int[] array = input.userInputArray();
                calculator = new Calculator(null);
                System.out.println("Sum of Array: " + calculator.sumOfArray(array));
                break;

            case 7: // Mean of Array
                array = input.userInputArray();
                calculator = new Calculator(null);
                System.out.println("Mean of Array: " + calculator.meanOfArray(array));
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}