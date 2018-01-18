class Proverb {

	String[] words;
	
    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        StringBuffer sb = new StringBuffer();
    		
        if (words.length == 0)
        		return "";
        else if (words.length == 1)
        		return sb.append(String.format("And all for the want of a %s.", words[0])).toString();
        else {
	        	for (int i = 0; i < words.length - 1; i++) {
	        		sb.append(String.format("For want of a %s the %s was lost.%n", words[i], words[i+1]));
	        }
	        
	        sb.append(String.format("And all for the want of a %s.", words[0]));
        }
        	
        return sb.toString();
    }
    
    public static void main(String[] args) {
    	String[] words  = new String[]{"nail", "shoe", "horse", "rider", "message", "battle", "kingdom"};   	
    	Proverb proverb = new Proverb(words);
    		
    		proverb.recite();
    }

}
