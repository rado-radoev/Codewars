import java.util.stream.IntStream;

//http://exercism.io/exercises/java/difference-of-squares/readme
public class Difference {
	
	public static int computeSquareOfSumTo(int number) {
		double sumSquared = 0;

		for (int i = 1; i <= number;i++) {
			// find the square of the sum
			sumSquared += i;
		}
		sumSquared = Math.pow(sumSquared, 2);

		return (int)sumSquared;
	}
	
	
	public static int computeSumOfSquaresTo (int number) {
		double sumOfSquares = 0;
		for (int i = 1; i <= number;i++) {
			// find the sum of the squares
			sumOfSquares += Math.pow(i, 2);
		}
		return (int)sumOfSquares;
	}
	
	
	public static int betweenSquareOfSumAndSumOfSquaresTo (int number) {
		return computeSquareOfSumTo(number) - computeSumOfSquaresTo(number);
	}
	

	public static void main (String[] args) {
		System.out.println(Difference.computeSquareOfSumTo(5));
	}
	
}
