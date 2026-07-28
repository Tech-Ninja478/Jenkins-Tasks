package calculator;
public class Calculator {
	public static void main(String[] args){
		Calculator calc = new Calculator();

		System.out.println("Addition: " + calc.sum(10,5));
		System.out.println("Subtraction: " + calc.minus(45,10));
		System.out.println("Multiplication: " + calc.multiply(25,4));
		System.out.println("Division: " + calc.division(10, 5));
	}

	public int sum(int a, int b){
		return a+b;
	}

	public int minus(int a, int b){
		return a-b;
	}

	public int multiply(int a, int b){
		return a*b;
	}

	public float division(int a, int b){
		if (b==0) return -1.0f;
		return (1.0f*a)/b;
	}

	public double power(int a, int b){
		return Math.pow(a,b);
	}
}
