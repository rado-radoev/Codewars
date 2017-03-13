// http://exercism.io/exercises/java/raindrops/readme
public class Raindrops {

	public static int convert(int number) {
		for (int i = 1; i <= 7; i += 2) {
			if (number % i == 0) {
				
				switch (i) {
				case 3:
					System.out.println("Pling");
					break;
				case 5:
					System.out.println("Plang");
					break;
				case 7:
					System.out.println("Plong");
					break;
				default:
					System.out.println(number);
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
