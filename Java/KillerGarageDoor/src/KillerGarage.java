//https://www.codewars.com/kata/killer-garage-door/train/java
public class KillerGarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Convert string to char array
	// 0 fully closed
	// 5 fully opened
	// . nothing
	// P Button is pressed - if no previous P -> Open
	// if Other P > close
	// O -> obstacle detected -  reverse counting;
	// if less than 1 -> zeros
	// if higher than 5 -> zeroes
	
	/*
	 * char[] arr = string.toCharArray();
	 * iterate through the array
	 * set a counter that is equal to the array length
	 * char previous = char[i - 1];
	 * char next = char[i + 1]
	 * char current = char[i]
	 * StringBuilder output = new StringBuilder()
	 * 
	 * if string start with . do nothing -> print 0
	 * if next string is . do nothing -> print 0
	 * if next string is . do nothing -> print 0
	 * if next string is P print 1
	 * if next string is . print 2
	 * if next string is . print 3
	 * if next string is . print 4
	 * if next string is . print 5
	 * if next string is . print 0
	 * if next string is . print 0
	 * if next string is P print 4
	 * if next string is . print 3
	 * if next string is . print 2
	 * if next string is P print 2
	 * if next string is . print 2
	 * if next string is . print 2
	 * if next string is P print 1
	 * if next string is . print 0
	 * if next string is . print 0
	 * if next string is P print 1
	 * if next string is . print 2
	 * if next string is . print 3
	 * if next string is O print 2
	 * if next string is . print 1
	 * if next string is . print 0
	 * 
	 * if door is closed P starts opening the door -> prints 1 to 5
	 * if door is opened P starts closing the door -> prints 5 to 1
	 * when door detects obstacle O it reverses the direction.
	 * . does nothing
	 * 
	 * 
	 * by default door is close
	 * I need a variable that monitors the door direction -> Open or close
	 * I need a variable for obstacle. by defautl it will be false. boolean isObstacle = false;
	 * I need a method that does the countdown or count up depending on the door position
	 * I need to check the next char and decide what to do based on the value
	 * 
	 * isDoorOpen = false
	 * isObstacle = false;
	 * int current count = 0;
	 * for (int i =0; i < charArray.lenght; i ++) 
	 * 	if door is closed
	 * 		if there is no obstacle
	 * 			check character
	 * 			if character is . 
	 * 				print 0
	 * 			else if character is P
	 * 				start opening the door (run the method that opens the door)
	 * 				isDoorOpen = true;
	 * 			else if character is O
	 * 				check current int if 0 do nothing
	 * 				else reverse counter
	 * 		
	 * 
	 * 
	 * 	counter = 0;
	 *  doorMoveCounter = 0; - this number should be changed by the method from 0 to 4 or 4 to 0 depending on the door direction
	 * 	while counter < charArray.lenght
	 * 		if isObstacle == false
	 * 			call the method to move the door
	 * 			check next char 
	 * 			if next char is O
	 * 				isObstacle == true;
	 * 		else // isObstacle == true - reversing the door opeing
	 * 			call the method to move the door in reverse
	 * 			check next char
	 * 			if next char is P - the door is Pause
	 * 		    keep printing the same number
	 * 
	 * 
	 * 
	 * 
	 * If I start opening/closing the door I have to check the next char
	 * if the next char is not P or O continue counting
	 * else if next char is P pause counting until P is pressed or end of char
	 * else if next char is O reverse counting
	 * 
	 * 
	 * 
	 * 
	 */
}
