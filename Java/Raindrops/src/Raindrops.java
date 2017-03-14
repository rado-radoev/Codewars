// http://exercism.io/exercises/java/raindrops/readme
public class Raindrops {

	public static String convert(int number) {
		StringBuilder sb = new StringBuilder();
		boolean factored = false;
		for (int i = 3; i <= 7; i += 2) {
			if (number % i == 0) {
				factored = true;
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
					break;
				}
			}
		}
		
		if (factored) {
			return sb.toString();
		}
		return sb.append(number).toString();
	}
}
