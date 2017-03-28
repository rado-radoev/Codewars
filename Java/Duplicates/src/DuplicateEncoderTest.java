import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DuplicateEncoderTest {
	
	DuplicateEncoder de;

	@Before
	public void setUp() throws Exception {
		de = new DuplicateEncoder();
	}

	@Test
	public void testPrespecialized() {
		assertEquals(")()())()(()()(", de.encode("Prespecialized"));
	}
	
	@Test
	public void testBrackets() {
		assertEquals("))))())))",de.encode("   ()(   "));
	}

}
