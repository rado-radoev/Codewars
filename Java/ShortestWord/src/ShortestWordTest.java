import static org.junit.Assert.*;

import org.junit.Test;

public class ShortestWordTest {

	@Test
	public void test() {
		String str = "bitcoin take over the world maybe who knows perhaps";
		assertEquals(3, ShortestWord.findShort(str));
	}
	
	@Test
	public void test2() {
		String str = "turns out random test cases are easier than writing out basic ones";
		assertEquals(3, ShortestWord.findShort(str));
	}

}
