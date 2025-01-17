//calculator.java
class Calculator{

	private int[] numbers;
	Calculator(int[] numbers){
		this.numbers = numbers;
	}

	int addition(){
		return numbers[0] + numbers[1];
	}

	int subtraction(){
		return numbers[0] - numbers[1];
	}
}