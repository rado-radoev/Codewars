import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class PersonTest {

	private Person person;
	private ByteArrayOutputStream outContent;
	
	@Before
	public void setup() {
		//person = new Person();
		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void cleanup() {
		System.setOut(null);
	}
	
	@Test
	public void checkNumberFour() {
		int age = 4;
		person = new Person(age);
		person.amIOld();
		
		assertEquals("You are young.", outContent.toString());
	}
}
