import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       int numberOfRows = in.nextInt();
       String currentLine = in.nextLine();
       while (numberOfRows > 0) {
	   		
	   		if (currentLine.matches("gmail.com")) {
	   			String name = currentLine.split("\\s")[0];
	   			System.out.println(name);
	   		}	
	   		currentLine = in.nextLine();
	   		numberOfRows--;
       }
    }
}