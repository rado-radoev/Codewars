//https://www.codewars.com/kata/killer-garage-door/train/java
public class KillerGarage {

	public static void main(String[] args) {
		//run("..........");
		//run("P..");
		//run("P....");
		//run("P.P.P...");
		run("P.....P....O.");
		//run("P.O....");
		//run("..P...O.....");
	}
	
	
	public static String run (String events) {
		//System.out.println(events);
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
					//System.out.print(currentCount);		// Do nothing print 0
					eventsOutput.append(currentCount);
				}
				else if (currentChar == 'P') {		// Check if character is P
					isDoorOpen = true;			// Door is open now
					if (currentCount + 1<= 5) {
						currentCount = currentCountIncrement(currentCount, isObstacle);		// Increment counter
					}
					//System.out.print(currentCount);
					eventsOutput.append(currentCount);
				}
				else if (currentChar == 'O') {		// If current char is O
					isObstacle = true;				// Invert the counter
					if (currentCount != 0) {		// If current count is not zero
						currentCount = currentCountIncrement(currentCount, isObstacle); // invoke the counter method
					}
					//System.out.print(currentCount);
					eventsOutput.append(currentCount);
				}
			}
			else if (isDoorOpen) { 	// If the door is open
				if (currentChar == '.') {		// If the character is .
					if (isDoorPaused) {		// If the door is pause
						//System.out.print(currentCount);		// Do nothing print 0
						eventsOutput.append(currentCount);						
					}
					else {		// If the door is not paused
						if (currentCount + 1 <= 5) {
							currentCount = currentCountIncrement(currentCount, isObstacle);
						}
						//System.out.print(currentCount);
						eventsOutput.append(currentCount);
					}
				}
				else if (currentChar == 'P') {		// If the current char is P
					if (isDoorPaused) {		// If the door is paused
						isDoorPaused = false;		// Door is not paused anymore. Start moving
						if (currentCount + 1 <= 5) {
							currentCount = currentCountIncrement(currentCount, isObstacle);
						}
						//System.out.print(currentCount);
						eventsOutput.append(currentCount);
					}
					else {			// If the door is not paused
						isDoorPaused = true; 		// Pause the door
						//System.out.print(currentCount);
						eventsOutput.append(currentCount);
					}
				}
				else if (currentChar == 'O') {		// If the current char is O
					isObstacle = true;				// Invert the counter
					if (currentCount != 0) {		// If the current count is not zero
						currentCount = currentCountIncrement(currentCount, isObstacle); // invoke the counter method
					}
					//System.out.print(currentCount);
					eventsOutput.append(currentCount);
				}
			
			}	
		}
		
		return eventsOutput.toString();
	}
	
	
	public static int currentCountIncrement(int currentCount, boolean isObstacle) {
		int output;
		if (isObstacle) {		// If there is obstacle reverse the counter
			output = currentCount - 1;
		}
		else {		// If there isn't obstacle add to counter
			output = currentCount + 1;
		}
		if (output < 0) {
			return 0;
		}
		else if (output > 5) {
			return 5;
		}
		return output;
	}

}
