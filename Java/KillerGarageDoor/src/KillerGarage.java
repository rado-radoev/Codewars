//https://www.codewars.com/kata/killer-garage-door/train/java
public class KillerGarage {

	public static void main(String[] args) {

	}
	
	
	public static void run (String events) {
		
		boolean isDoorOpen = false;		// We start with closed door
		boolean isDoorPaused = false;	// By default the door is not pause
		boolean isObstacle = false;		// By default there is no obstacle
		int currentCount = 0;			// By default the count starts from 0
		StringBuilder eventsOutput = new StringBuilder(); 	// Output string
		
		char[] command = events.toCharArray(); 	// Convert the events string to char array
		
		for (int i = 0; i < command.length; i++) {
			char currentChar = command[i];		// Get current char in variable. Easier to read
			if (!isDoorOpen) { 		// If the door is closed
				if (currentChar == '.')	{		// Check if current char is .
					System.out.println(currentCount);		// Do nothing print 0
					eventsOutput.append(currentCount);
				}
				else if (currentChar == 'P') {		// Check if character is P
					isDoorOpen = true;			// Door is open now
					if (currentCount + 1 < 5) {
						currentCount = currentCountIncrement(currentCount, isObstacle);		// Increment counter
					}
					System.out.println(currentCount);
					eventsOutput.append(currentCount);
				}
				else if (currentChar == 'O') {		// If current char is O
					isObstacle = true;				// Invert the counter
					if (currentCount != 0) {		// If current count is not zero
						currentCount = currentCountIncrement(currentCount, isObstacle); // invoke the counter method
					}
					System.out.println(currentCount);
					eventsOutput.append(currentCount);
				}
			}
			else if (isDoorOpen) { 	// If the door is open
				if (currentChar == '.') {		// If the character is .
					if (isDoorPaused) {		// If the door is pause
						System.out.println(currentCount);		// Do nothing print 0
						eventsOutput.append(currentCount);						
					}
					else {		// If the door is not paused
						if (currentCount + 1 < 5) {
							currentCount = currentCountIncrement(currentCount, isObstacle);
						}
						System.out.println(currentCount);
						eventsOutput.append(currentCount);
					}

				}
			
			}
			
			
			
			
		}
		

		
	}
	
	
	public static int currentCountIncrement(int currentCount, boolean isObstacle) {
		if (isObstacle) {		// If there is obstacle reverse the counter
			return currentCount - 1;
		}
		else {		// If there isn't obstacle add to counter
			return currentCount + 1;
		}
	}

}
