// Make sure your class is public
 public class Kata {
	 
    public static double findUniq(double arr[]) {
      int i = 1;
    	for (; i < arr.length - 1; i++) {
        if (arr[i] == arr [i + 1] && arr[i] == arr[i - 1]) {
          continue;
        }
      }
      return (double)arr[i];
  }
}