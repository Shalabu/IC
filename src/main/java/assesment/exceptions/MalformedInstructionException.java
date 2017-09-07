package assesment.exceptions;

import java.io.IOException;

public class MalformedInstructionException extends IOException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MalformedInstructionException(String error, String instruction) {
		super(new String(error + " : " + instruction));
	}
}
