import java.util.ArrayList;
import java.util.List;

public class FizzBizz {

	public static void main(String[] args) {
		List<String> ls = fizzBuzz(15);
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(ls.get(i));
		}
	}
	
	
	public static List<String> fizzBuzz(int n) {
		List<String> ls = new ArrayList<String>();
		
        for (int i = 1; i <= n; i++) {
        	if ((i % 3 == 0) && (i % 5 == 0)) {
        		ls.add("FizzBuzz");
        	}
        	else if (i % 3 == 0) {
        		ls.add("Fizz");
        	}
        	else if (i % 5 == 0) {
        		ls.add("Buzz");
        	}
        	else {
        		ls.add(Integer.toString(i));
        	}
        }
        
        return ls;
    }

}
