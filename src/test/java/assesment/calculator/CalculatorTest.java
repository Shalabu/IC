package assesment.calculator;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator calculateUnderTest;
	ArrayList<String> listOfInstructions;

	@Before
	public void setUp() throws Exception {
		calculateUnderTest = new Calculator();
		listOfInstructions = new ArrayList<>();

	}

	@Test
	public void testCalculate() {
		// fail("Not yet implemented");

		// provided sample 1
		listOfInstructions.add("add 2");
		listOfInstructions.add("multiply 3");
		listOfInstructions.add("apply 4");

		int result = 0;

		result = (int) calculateUnderTest.calculate(listOfInstructions);

		assertEquals(18, result);

		listOfInstructions.clear();

		// provided sample 2
		listOfInstructions.add("multiply 9");
		listOfInstructions.add("apply 5");

		result = (int) calculateUnderTest.calculate(listOfInstructions);

		assertEquals(45, result);

		listOfInstructions.clear();

		// provided sample 3
		listOfInstructions.add("apply 1");

		result = (int) calculateUnderTest.calculate(listOfInstructions);

		assertEquals(1, result);

	}

}
