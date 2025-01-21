import java.util.*;

class UserInput{
	int[] userInput(){
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[2];

		System.out.println("Enter first number:");
		numbers[0] = scan.nextInt();

		System.out.println("Enter second number:");
		numbers[1] = scan.nextInt();

		return numbers;
	}

	// Take an array as input
    int[] userInputArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        return array;
    }

    // Display menu and get user choice
    int getUserChoice() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci Sequence");
        System.out.println("6. Sum of Array");
        System.out.println("7. Mean of Array");

        return scan.nextInt();
    }
}