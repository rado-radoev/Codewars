import java.util.BitSet;
public class HandshakeCalculator {

	public static void main(String[] args) {
		int number = 16;
		//System.out.println(Integer.toBinaryString(15));
		
		BitSet bit = new BitSet();
		bit.set(number);
		System.out.println(bit.size());
		
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
