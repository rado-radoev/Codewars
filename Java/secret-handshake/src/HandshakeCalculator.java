import java.util.List;

public class HandshakeCalculator {
	
	public static enum Signal {
		WINK,
		DOUBLE_BLINK,
		CLOSE_YOUR_EYES,
		JUMP
	}

	public static int calculateHandshake (int number) {
		return 0;
	}
	
	/**
	 * Check bit at specific position
	 * @param x the Integer to check
	 * @param k the bit position to check. Start from 0
	 * @return True if bit at position K is 1. False if bit at position K is 0.
	 */
	public static boolean CheckBit(int x, int k) {
		return (x & 1 << k) != 0;
	} 

	public static void main(String[] args) {
		int a = 31; //0011
		int b = 1; //0001
		int c = 2; //0010
		
		
		//System.out.println(CheckBit(a, 19));
		//System.out.println(Integer.toBinaryString(a & (b << 1)));
		//System.out.println(Integer.numberOfLeadingZeros(b));
		
		// The integer can store 32 bit numbers
		// So to limit the search just get how many bits are occupied
		int searchLimiter = 32 - Integer.numberOfLeadingZeros(a);
		
		for (int i = 0; i < searchLimiter; i++) {
			if (CheckBit(a, i)) {
				switch (i) {
				case 0:
					System.out.println(Signal.WINK);
					break;
				case 1:
					System.out.println(Signal.DOUBLE_BLINK);
					break;
				case 2:
					System.out.println(Signal.CLOSE_YOUR_EYES);
					break;
				case 3: 
					System.out.println(Signal.JUMP);
					break;
				case 4: 
					System.out.println("Reverse Array");
					break;
				default:
					break;
				}
			}
		}
		
		
		// E tova chukane chakah
		//https://www.cs.uky.edu/~keen/intro/binary-to-decimal.html
		
		// Or try this:
		//http://stackoverflow.com/questions/1092411/java-checking-if-a-bit-is-0-or-1-in-a-long
		
		//Plan of action
		/* When you receive the number 
		 * Check if the 1st bit is set to 1
		 * if it is add Wink to array
		 * check if 2nd bit is set to 1
		 * if it is add double wink to array
		 * check if 3rd bit is set to 1
		 * if it is add close your eyes to array
		 * check if 4th bit is set to 1
		 * if it is add jump to array
		 * check if 6th bit is set to 1
		 * if it is reverse the array
		 * no more checking
		 * */
	
	}

}
