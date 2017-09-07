package assesment.calculator;

import java.io.IOException;

import assesment.reader.InstructionsFileRead;

/**
 * Instructions calculator app launcher
 *
 */
public class App {
	public static void main(String[] args) {

		if (args.length != 1)
			System.out.println("please enter instructions file name !");

		else

		{
			try {

				InstructionsFileRead reader = new InstructionsFileRead();

				reader.initialize(args[0]);

				Calculator calculator = new Calculator();

				System.out.println("The result is : " + calculator.calculate(reader.getInstructions()));

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
