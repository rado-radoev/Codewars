import java.util.Collections;
import java.util.List;

public class SieveTest2 {

	public static void main(String[] args) {
		
        Sieve sieve = new Sieve(10);
        List<Integer> expectedOutput = Collections.singletonList(2);
        sieve.getPrimes();
        
	}
}
