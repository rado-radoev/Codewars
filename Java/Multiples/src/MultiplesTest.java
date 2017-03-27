import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;

import org.junit.Test;

public class MultiplesTest {

	Multiples multiples;
	
	@Before
	public void setUp() {
		multiples = new Multiples();
	}
	
	@Test
	public void testTen() {
		assertEquals(23, multiples.solution(10));
	}
	

	@Test
	public void testTwenty() {
		assertEquals(78, multiples.solution(20));
	}
	
	@Ignore
	@Test
	public void TestOneThousand() {
		assertEquals(233168, multiples.solution(1000));
	}
	
}
