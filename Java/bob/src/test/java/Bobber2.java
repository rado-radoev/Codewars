import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Bobber2 {

	public static void main(String[] args) {
		
		ExecutorService es = Executors.newCachedThreadPool();
		
		String[] messages = {"Tom-ay-to, tom-aaaah-to.", "WATCH OUT!",
				"Does this cryogenic chamber make me look fat?", 
				"Let's go make out behind the gym!",
				"WHAT THE HELL WERE YOU THINKING?"};
		
		
		for (String message : messages) {
			FutureTask<String> replies = new FutureTask<>(new Bob(message));
			es.execute(replies);
			
			try {
				System.out.println("Running future task");
				System.out.println(replies.get(5, TimeUnit.SECONDS));
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		}

		
	}

}
