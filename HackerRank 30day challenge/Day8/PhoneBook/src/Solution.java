import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Solution{
	
	private static Dictionary<String, Integer> phoneBook = new Hashtable<>();
	
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        
        Enumeration<String> names = phoneBook.keys();
        
        while(in.hasNext()){
            String s = in.next();
            
            boolean nameExists = false;
            while (names.hasMoreElements()) {
				String name = (String) names.nextElement();
				if (s.equals(name)) {
					nameExists = true;
					break;
				}
			}
            
            if (!nameExists) {
            		System.out.println("Not found");
            		continue;
            }
        
            try {
    				Integer phoneNumber = phoneBook.get(s);
    				System.out.printf("%s=%d%n", s, phoneNumber);
    			} catch (NullPointerException pre) {
    				pre.printStackTrace();
    			}
                    
        }
        in.close();
    }
}