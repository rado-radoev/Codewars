import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try {
			System.out.println(Integer.valueOf(S));
		} catch (NumberFormatException nfe) {
			System.out.println("Bad String");
		}
    }
}