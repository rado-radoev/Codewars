class RotationalCipher {
	
	int shiftKey;

    RotationalCipher(int shiftKey) {
    	this.shiftKey = shiftKey;
    }

    boolean isInrange(int x, int min, int max) {
    	return x >= min && x <= max;
    }
   
    String rotate(String data) { 	
    	   	
    	StringBuffer sb = new StringBuffer(data.length());
    	
    	for (int i = 0; i < data.length(); i++) {

    		
    		int c = (int)data.charAt(i);
    		int res = c;
    		
    		if (isInrange(c, 65, 90)) {
    			res = c + shiftKey;
    			if (res > 90) {
    				res = (res - 90) + 64;
    			}
    		}
    		else if (isInrange(c, 97, 122)) {
    			res = c + shiftKey;
    			if (res > 122) {
    				res = (res - 122) + 96;
    			}
    		}
    		
    		sb.append((char)(res));
    		  		
    	}
    	
    	return sb.toString();
    }

}
