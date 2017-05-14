import java.util.Collections;
import java.util.List;

public class SieveTest2 {

	public static void main(String[] args) {
		
        Sieve sieve = new Sieve(1000000000);
        long start = System.currentTimeMillis();
        sieve.getPrimes();
        long elapsed = System.currentTimeMillis() - start;
        long seconds = (elapsed / 1000) % 60;
        System.out.printf("Running time: %d seconds", seconds);
        
	}
}
