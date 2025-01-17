
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
}