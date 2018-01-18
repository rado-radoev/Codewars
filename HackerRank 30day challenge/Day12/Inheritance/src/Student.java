
public class Student extends Person {
	
	private int[] scores;
	
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
	public Student(String firstName, String lastName, int id, int[] scores) {
		super(firstName, lastName, id);
		this.scores = scores;
	}

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
	public char calculate() {
		int score = 0;
		for (int i : scores) {
			score += i;
		}
		
		score /= scores.length;
		//System.out.println(score);
		
		if (isBetween(score, 90, 100, true))
			return 'O';
		else if (isBetween(score, 80, 90, false))
			return 'E';
		else if (isBetween(score, 70, 80, false))
			return 'A';
		else if (isBetween(score, 55, 70, false))
			return 'P';
		else if (isBetween(score, 40, 55, false))
			return 'D';
		else 
			return 'T';
	}
	
	private boolean isBetween(int num, int lower, int higher, boolean higherAndEquals) {
		if (higherAndEquals)
			return lower <= num && num <= higher;
		
		return lower <= num && num < higher;
	}

}
