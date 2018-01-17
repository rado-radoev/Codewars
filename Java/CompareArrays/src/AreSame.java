import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;


public class AreSame {
	
	private static ExecutorService executorSevice;
	private static boolean powered;
	
	public static void main(String[] args) {
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		System.out.println(comp(a, b));
	}
	
	public static boolean comp(int[] a, int[] b) {
    
		validate(a,b);
		executorSevice = Executors.newCachedThreadPool();
		executorSevice.execute(new Runnable() {
			
			@Override
			// square all numbers in the 
			public void run() {
				for (int i = 0; i < a.length; i++) {
					a[i] = (int)Math.pow(a[i], 2);
				}
				powered = true;
			}
		});
		
		// sort array a and b
		// only sort a if the task that is poworing it has completed
		executorSevice.execute(new Runnable() {
			
			@Override
			public void run() {
				// sort b
				Arrays.parallelSort(b);
				// wait for a to be sorted
				while (!powered) {
					try {
						executorSevice.awaitTermination(20, TimeUnit.SECONDS);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				// sort a
				Arrays.parallelSort(a);
			}
		});
		
		executorSevice.shutdown();
		try {
			executorSevice.awaitTermination(1, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// check if b and a match
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		
	return true;
  }
	
	// validate if arrays are not null/empty or are equal size
	private static boolean validate(int[] a, int[] b) {
		if (a.length != b.length)
			return false;
		else if (a.length == 0 || b.length == 0)
			return false;
		else if (a == null || b == null)
			return false;
		
		// array calculation can proceed
		return true;
	}
	
}