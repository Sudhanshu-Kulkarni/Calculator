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

	int multiplication(){
		return numbers[0] * numbers[1];
	}

	int division(){
		if (numbers[1] != 0) {
            return numbers[0] / numbers[1];
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
	}

	

}

