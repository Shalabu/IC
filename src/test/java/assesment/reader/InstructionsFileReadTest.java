package assesment.reader;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import assesment.exceptions.MalformedEndingException;
import assesment.exceptions.MalformedInstructionException;

public class InstructionsFileReadTest {

	InstructionsFileRead readerUnderTest;

	@Before
	public void setUp() throws Exception {
		readerUnderTest = new InstructionsFileRead();
	}

	// test some real file
	@Test
	public void testInitialize() {
		// fail("Not yet implemented");

		try {

			readerUnderTest.initialize("res/valid/test_case1.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// test a fake file
	@Test(expected = FileNotFoundException.class)
	public void testInitializeWithFakeFile() throws IOException {
		readerUnderTest.initialize("res/valid/fake_file.txt");
		// TODO Auto-generated catch block

	}

	// assure than instructions list has been formed
	@Test
	public void testInstructionsListFormed() {
		try {

			readerUnderTest.initialize("res/valid/test_case2.txt");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(readerUnderTest.getInstructions().size() == 3);

	}

	// test an instructions file wit malformed instruction
	@Test(expected = MalformedInstructionException.class)
	public void testMalformedInstruction() throws IOException {
		// InstructionsFileRead readerUnderTest = new InstructionsFileRead();
		readerUnderTest.initialize("res/invalid/invalid_inst.txt");

	}

	// test an instructions file wit malformed ending
	@Test(expected = MalformedEndingException.class)
	public void testWrongEnding() throws IOException {
		// InstructionsFileRead readerUnderTest = new InstructionsFileRead();

		readerUnderTest.initialize("res/invalid/invalid_ending.txt");

	}

}
