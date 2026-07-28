├── pom.xml
├── README.md
├── src
    ├── main
    │   └── java
    │       └── calculator
    │           └── Calculator.java
    └── test
        └── java
            └── calculator
                └── CalculatorTest.java
```

pom.xml

```xml
<project>
<modelVersion>4.0.0</modelVersion>
<groupId>calculator</groupId>
<artifactId>maven-junit</artifactId>
<version>1.0-SNAPSHOT</version>
<packaging>jar</packaging>

<properties>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
</properties>


<dependencies>
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.10.1</version>
    <scope>test</scope>
</dependency>
</dependencies>

<build>
<plugins>
	<plugin>
	<artifactId>maven-surefire-plugin</artifactId>
	<version>3.2.5</version>
	</plugin>
</plugins>
</build>

</project>
```

Calculator.java

```java
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
}
```

CalculatorTest.java

```java
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


}
```
