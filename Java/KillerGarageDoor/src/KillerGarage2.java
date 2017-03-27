//https://www.codewars.com/kata/killer-garage-door/train/java
public class KillerGarage2 {

	public static void main(String[] args) {
		//run("..........");
		//run("P..");
		//run("P....");
		//run("P.P.P...");
		run("P.....P........P....O....");
		//run("P.O....");
		//run("..P...O.....");
	}
	
	
	public static String run (String events) {
		System.out.println(events);
		boolean isDoorOpen = false;		// We start with closed door
		boolean isDoorFullyOpen = false; // We want to start with door fully closed
		boolean isDoorPaused = false;	// By default the door is not pause
		boolean isObstacle = false;		// By default there is no obstacle
		int currentCount = 0;			// By default the count starts from 0
		StringBuilder eventsOutput = new StringBuilder(); 	// Output string
		
		char[] command = events.toCharArray(); 	// Convert the events string to char array
		
		for (int i = 0; i < command.length; i++) {
			char currentChar = command[i];		// Get current char in variable. Easier to read
			if (!isDoorOpen) { 		// If the door is closed
				if (currentChar == '.')	{		// Check if current char is .
					System.out.print(currentCount);		// Do nothing print 0
					eventsOutput.append(currentCount);
				}
				else if (currentChar == 'P') {		// Check if character is P
					isDoorOpen = true;			// Door is open now
					if (currentCount + 1 <= 5) {
						currentCount = currentCountIncrement(currentCount, isObstacle);		// Increment counter
					}
					System.out.print(currentCount);
					eventsOutput.append(currentCount);
				}
				else if (currentChar == 'O') {		// If current char is O
					isObstacle = true;				// Invert the counter
					if (currentCount != 0) {		// If current count is not zero
						currentCount = currentCountIncrement(currentCount, isObstacle); // invoke the counter method
					}
					System.out.print(currentCount);
					eventsOutput.append(currentCount);
				}
			}
			else if (isDoorOpen) { 	// If the door is open
				
				if (currentCount == 5 ) {	// If the door is fully opened
					isDoorFullyOpen = true;		// The door is fully opened
				}
				else if (currentCount == 0) { 	// If the door is fully closed
					isDoorFullyOpen = false;
				}
				
				if (currentChar == '.') {		// If the character is .
					if (isDoorPaused) {		// If the door is paused
						System.out.print(currentCount);		// Do nothing print 0
						eventsOutput.append(currentCount);						
					}
					else if (!isDoorPaused) {		// If the door is not paused
						if (isDoorFullyOpen) {		// And the door is fully opened
							currentCount = currentCountIncrement(currentCount, true);	// Start closing the door
						}
						else {
							currentCount = currentCountIncrement(currentCount, isObstacle);
						}
						System.out.print(currentCount);
						eventsOutput.append(currentCount);
					}
				}
				
				else if (currentChar == 'P') {		// If the current char is P
					if (isDoorPaused) {		// If the door is paused
						isDoorPaused = false;		// Door is not paused anymore. Start moving
						if (currentCount + 1 <= 5) {
							currentCount = currentCountIncrement(currentCount, isObstacle);
						}
						System.out.print(currentCount);
						eventsOutput.append(currentCount);
					}
					else if (!isDoorPaused) {			// If the door is not paused
						if (isDoorFullyOpen) {		// If the door is fully opened
							currentCount = currentCountIncrement(currentCount, true);	// Start closing the door
							System.out.print(currentCount);
							eventsOutput.append(currentCount);							
						}
						else {	// Pause the door
							isDoorPaused = true; 		
							System.out.print(currentCount);
							eventsOutput.append(currentCount);			
						}
					}
				}
				
				else if (currentChar == 'O') {		// If the current char is O
					isObstacle = true;				// Invert the counter
					if (currentCount != 0) {		// If the current count is not zero
						currentCount = currentCountIncrement(currentCount, isObstacle); // invoke the counter method
					}
					System.out.print(currentCount);
					eventsOutput.append(currentCount);
				}
			
			}	
		}
		
		return eventsOutput.toString();
	}
	
	// if direction is true door is closing (going down)
	// if direction is false door is opening (going up)
	public static int currentCountIncrement(int currentCount, boolean direction) {
		int output;
		if (direction) {		// If direction is true the door is closing (going down)
			output = currentCount - 1;
		}
		else {		// If the direction is false the door is opening (going up)
			output = currentCount + 1;
		}
		return output;
	}

}
