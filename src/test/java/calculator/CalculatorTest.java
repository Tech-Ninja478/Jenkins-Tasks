package calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest{
Calculator calculator = new Calculator();

	@Test
	void sum() {
		int res = calculator.sum(10, 15);
		assertEquals(25,res);
	}

	@Test
	void minus() {
		int res = calculator.minus(20, 15);
		assertEquals(5,res);
	}

	@Test
	void multiply() {
		int res = calculator.multiply(3, 4);
		assertEquals(12,res);
	}

	@Test
	void division() {
		float res = calculator.division(10, 2);
		assertEquals(5.0f,res);

		res = calculator.division(10, 0);
		assertEquals(-1.0f,res);
	}

	@Test
	void modulus() {
		int res = calculator.modulus(10, 3);
		assertEquals(1, res);
	void power() {
		double res = calculator.power(2, 3);
		assertEquals(8, res);
	}

}
