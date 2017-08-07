import static org.junit.Assert.*;

import org.junit.Test;

public class ValidNumberJTest {

	@Test
	public void testE() {
		assertFalse("Returned true",ValidNumber.isNumber("e"));
	}
	
	
	@Test
	public void testSpace() {
		assertFalse("Returned true",ValidNumber.isNumber(" "));
	}

}
