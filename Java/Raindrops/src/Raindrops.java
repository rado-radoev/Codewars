// http://exercism.io/exercises/java/raindrops/readme
public class Raindrops {

	public static String convert(int number) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 7; i += 2) {
			if (number % i == 0) {
				
				switch (i) {
				case 3:
					sb.append("Pling");
					break;
				case 5:
					sb.append("Plang");
					break;
				case 7:
					sb.append("Plong");
					break;
				default:
					System.out.println(number);
					break;
				}
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
