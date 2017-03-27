//https://www.codewars.com/kata/killer-garage-door/train/java
public class KillerGarage {

	public static void main(String[] args) {
		//run("..........");
		//run("P..");
		//run("P....");
		//run("P.P.P...");
		run("P.....P.....O..P..P.O...P...........O.....");
		//run("P.O....");
		//run("..P...O.....");
	}
	
	
	public static String run (String events) {
		System.out.println(events);
		boolean isDoorOpen = false;		// We start with closed door
		boolean isDoorPaused = false;	// By default the door is not pause
		boolean isObstacle = false;		// By default there is no obstacle
		boolean doorDirection = false;	// Door direction - false = closing, true = opening
		int currentCount = 0;			// By default the count starts from 0	
		StringBuilder eventsOutput = new StringBuilder(); 	// Output string
		
		char[] command = events.toCharArray(); 	// Convert the events string to char array
		
		for (int i = 0; i < command.length; i++) {
			char currentChar = command[i];
			if (!isDoorOpen) {  // if the door is closed
				if (currentChar == '.') {	// keep the current count, don't change it
//					System.out.print(currentCount);
					eventsOutput.append(currentCount);
				}
				else if (currentChar == 'P') {
					doorDirection = true;	// Change the door direction
					isDoorOpen = true;		// Mark the door as open
					currentCount = currentCountIncrement(currentCount, doorDirection, isObstacle);
//					System.out.print(currentCount);
					eventsOutput.append(currentCount);
				}
			}
			
			else if (isDoorOpen)	{  // if the door is open
				if (currentChar == '.') {
					if (currentCount == 5 || isDoorPaused) { // if the door is fully open or paused do nothing
//						System.out.print(currentCount);
						eventsOutput.append(currentCount);
					}
					else { // else increment the counter
						currentCount = currentCountIncrement(currentCount, doorDirection, isObstacle);
//						System.out.print(currentCount);
						eventsOutput.append(currentCount);
					}
				}
				else if (currentChar == 'P') {
					if (currentCount == 5) {	// Start closing the door
						doorDirection = false;	// door must be going down
						currentCount = currentCountIncrement(currentCount, doorDirection, isObstacle);
//						System.out.print(currentCount);
						eventsOutput.append(currentCount);
					}
					else if (currentCount == 0) {	// if door is fully closed
						doorDirection = true;		// Start opening the door
						currentCount = currentCountIncrement(currentCount, doorDirection, isObstacle);
//						System.out.print(currentCount);
						eventsOutput.append(currentCount);
					}
					else if (isDoorPaused) {	// If the door is paused
						isDoorPaused = false; // Unpause the door
						currentCount =  currentCountIncrement(currentCount, doorDirection, isObstacle);
//						System.out.print(currentCount);
						eventsOutput.append(currentCount);
					}
					else {		// If the door is not paused
						isDoorPaused = true; 	// Pause the door
//						System.out.print(currentCount);
						eventsOutput.append(currentCount); 	// do nothing 
					}
				}
				
				if (currentChar == 'O') {
					if (currentCount != 0 && currentCount != 5 && !isDoorPaused) { 	// if the door is moving
						isObstacle = true;		// Obstacle detected
						currentCount = currentCountIncrement(currentCount, doorDirection, isObstacle);
					}
//					System.out.print(currentCount);
					eventsOutput.append(currentCount);

				}
			}
		}
		
		return eventsOutput.toString();
	}
	

	public static int currentCountIncrement(int currentCount, boolean doorDirection, boolean isObstacle) {
		int output;
		if (doorDirection) {		// If direction is true the door is opening (going up)
			if (isObstacle)	{	// If there is an obstacle
			output = currentCount - 1;
			}
			else {		// if there is no obstacle
				output = currentCount + 1; 
			}
		}
		else {		// If the direction is false the door is closing (going down)
			if (isObstacle) { 	// If there is an obstacle
				output = currentCount + 1;
			}
			else {		// if there is no obstacle
				output = currentCount - 1;
			}
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
