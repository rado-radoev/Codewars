import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



public class Bobber{
	
	public static void main(String[] args) {
		
		ExecutorService es = Executors.newCachedThreadPool();
		
		String[] messages = {"Tom-ay-to, tom-aaaah-to.", "WATCH OUT!",
				"Does this cryogenic chamber make me look fat?", 
				"Let's go make out behind the gym!",
				"WHAT THE HELL WERE YOU THINKING?"};
		
		for (int i = 0; i < messages.length; i++) {
			es.execute(new Bob(messages[i]));
				
		}
		
		try {
			es.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
