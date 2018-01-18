import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	public Difference(int[] elements) {
  		this.elements = elements;
  	}
  	

  	public void computeDifference() {
  		Arrays.sort(elements);
  		
  		maximumDifference =  elements[elements.length - 1] - elements[0];
  	}
  	
  	
} // End of Difference class
