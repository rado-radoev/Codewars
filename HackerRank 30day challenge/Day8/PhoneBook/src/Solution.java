import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class Solution{
	
	private static Map<String, Integer> phoneBook = new HashMap<String, Integer>();
	
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            
            if (phoneBook.containsKey(s)) {
            		System.out.printf("%s=%d%n", s, phoneBook.get(s));
            }
            else {
            		System.out.println("Not found");
            }
            
        }
        in.close();
    }
}