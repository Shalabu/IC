package assesment.reader;

import java.io.IOException;

public interface InstructionsReader {

	static final String MALFORMED_INSTRUCTION = "ERROR : Instruction is malformed!";
	static final String MALFORMED_ENDING = "ERROR : Last instruction must be apply !";
	static final String FILE_NOT_FOUND = "ERROR : File does not exist!";

	/**
	 * Receives a file name and populates the instructions list, if the file is not
	 * found, it will throw file not found exception. Or a custom exceptions
	 * describing file instructions errors.
	 *
	 */
	public void initialize(String filename) throws IOException;

}
