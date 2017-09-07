package assesment.calculator;

import java.util.ArrayList;

/*
 * The main calculator engine
 * */
public class Calculator implements InstructionsCalculator {

	public double calculate(ArrayList<String> instructions) {
		double result = 0, applyNum = 0;
		String apply = instructions.get(instructions.size() - 1);
		String applyValue = apply.replaceAll("apply ", "");

		applyNum = Integer.valueOf(applyValue);

		result = applyNum;

		String numValue = null;
		for (String instruction : instructions) {

			if (instruction.contains("add")) {
				numValue = instruction.replaceAll("add ", "");
				result += Integer.valueOf(numValue);
			}

			if (instruction.contains("multiply")) {
				numValue = instruction.replaceAll("multiply ", "");
				result *= Integer.valueOf(numValue);
			}
			if (instruction.contains("subtract")) {
				numValue = instruction.replaceAll("subtract ", "");
				result -= Integer.valueOf(numValue);
			}

			if (instruction.contains("divide")) {
				numValue = instruction.replaceAll("divide ", "");
				result /= (double) Integer.valueOf(numValue);
			}
		}

		return result;
	}

}
