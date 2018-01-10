import static java.lang.Math.log10;
import static java.lang.Math.floor;

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		// get the number of digits in the number
		int digits = (int) (floor( log10( numberToCheck ) ) + 1);
		int num = numberToCheck;
		int result = 0;
		
		for (int i = 0; i < digits; i++) {
			result += (int) Math.pow(num % 10, digits);
			num /= 10;
		}
		
		if (result == numberToCheck) return true;
		else return false;
		
	}

}


