
import java.util.*;
class UserInput{
	int[] userinput(){
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
}