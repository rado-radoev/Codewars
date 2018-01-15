import java.util.*;
import java.math.*;

public class Operators {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tax = mealCost * ((double)taxPercent / 100);
        double tip = mealCost * ((double)tipPercent / 100);
        double total = mealCost + tax + tip;
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(total);
      
        // Print your result
        System.out.println(totalCost);
    }
}