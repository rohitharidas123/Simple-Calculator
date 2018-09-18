
//Rohit Haridas Subtracting Calculator

public class CalculatorMain {

	public static void main(String[] args)
	
	{
		Calculator calculator = new Calculator();
		int sum = (calculator.add(2,4));
		int diff = (calculator.sub(10, 6));
		System.out.println("The sum is " + sum);
		System.out.println("The difference is " + diff);
}		

}