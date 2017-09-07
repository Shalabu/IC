package assesment.exceptions;

import java.io.IOException;

public class MalformedEndingException extends IOException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MalformedEndingException(String error, String endInstruction) {
		super(new String(error + " : " + endInstruction));
	}

}
