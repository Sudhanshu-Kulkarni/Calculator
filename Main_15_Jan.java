class Main_15_Jan{

		public static void main(String args[]){
		
		UserInput input = new UserInput();
        int[] numbers = input.userinput(); 

        Calculator cal = new Calculator(numbers);

        // Display addition and subtraction results
        System.out.println("Addition: " + cal.addition());
        System.out.println("Subtraction: " + cal.subtraction());

	}
}