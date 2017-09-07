package assesment.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import assesment.exceptions.MalformedEndingException;
import assesment.exceptions.MalformedInstructionException;

/**
 * Instructions File Reader and initializer
 */

public class InstructionsFileRead implements InstructionsReader {

	// instructions list
	private ArrayList<String> instructions;

	@Override
	public void initialize(String filename) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		File instructionsFile = null;

		instructions = new ArrayList<>();

		instructionsFile = new File(filename);
		if (instructionsFile.exists()) {

			try {
				fr = new FileReader(instructionsFile);
				br = new BufferedReader(fr);
				String line = null;

				while ((line = br.readLine()) != null) {

					// an instruction must be a keyword and a number
					if (!(line.matches("^(add|divide|subtract|multiply|apply) \\-?[0-9]+$")))
						throw new MalformedInstructionException(MALFORMED_INSTRUCTION, line);

					this.instructions.add(line);

					// make sure that apply does exist in the middle
					if (line.contains("apply"))
						break;
				}

				// checks for last instruction
				if (!(this.instructions.get(this.instructions.size() - 1).matches("^apply \\-?[0-9]+$")))
					throw new MalformedEndingException(MALFORMED_ENDING,
							this.instructions.get(this.instructions.size() - 1));


			} finally {
				// TODO: handle finally clause
				br.close();
			}

		}

		else {
			throw new FileNotFoundException(FILE_NOT_FOUND);
		}

	}

	public ArrayList<String> getInstructions() {
		return instructions;
	}

	public void setInstructions(ArrayList<String> instructions) {
		this.instructions = instructions;
	}

}
