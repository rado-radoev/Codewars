import static org.junit.Assert.*;

import org.junit.Test;

public class OutlierTest {

	@Test
	public void test() {
		int[] exampleTest1 = {2,16,8,-10,3};
		assertEquals(3, Outlier.find(exampleTest1));
	}
	
	@Test
	public void test2() {
		int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
		assertEquals(206847684, Outlier.find(exampleTest2));
	}
	
	@Test
	public void test3() {
		int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
		assertEquals(0, Outlier.find(exampleTest3));
	}

}
