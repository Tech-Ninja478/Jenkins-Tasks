package calculator;
public class Calculator {
	public static void main(String[] args){
		System.out.println("Calculator!");
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

	public int modulus(int a, int b){
		return a % b;
	}
}
