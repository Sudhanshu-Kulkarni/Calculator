class Calculator {

    // Instance variable to store the numbers for calculation
    private int[] numbers;

    // Constructor to initialize the numbers array
    Calculator(int[] numbers) {
        this.numbers = numbers;
    }

    // Method to perform addition on the first two numbers
    int addition() {
        return numbers[0] + numbers[1];
    }

    // Method to perform subtraction (first number - second number)
    int subtraction() {
        return numbers[0] - numbers[1];
    }

    // Method to perform multiplication on the first two numbers
    int multiplication() {
        return numbers[0] * numbers[1];
    }

    // Method to perform division (first number / second number)
    // It checks if division by zero is attempted
    int division() {
        if (numbers[1] != 0) {
            return numbers[0] / numbers[1];
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0; // Return 0 if division by zero occurs
        }
    }

    // Method to generate the Fibonacci sequence up to the nth term
    int[] fibonacci(int n) {
        int[] fib = new int[n];  // Create an array to store Fibonacci numbers
        fib[0] = 0; // The first Fibonacci number is 0
        if (n > 1) fib[1] = 1; // The second Fibonacci number is 1 if n > 1
        
        // Fill the Fibonacci array with the sum of the previous two numbers
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        return fib; // Return the complete Fibonacci sequence array
    }

    // Method to calculate the sum of all elements in the given array
    int sumOfArray(int[] array) {
        int sum = 0; // Initialize sum to 0
        // Loop through each element and add it to sum
        for (int num : array) {
            sum += num;
        }
        return sum; // Return the total sum
    }

    // Method to calculate the mean (average) of the elements in the array
    double meanOfArray(int[] array) {
        int sum = sumOfArray(array); // Get the sum of array elements
        return (double) sum / array.length; // Calculate and return the mean
    }
}
