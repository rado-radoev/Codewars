import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

class KindergartenGarden {
	
	private String[] students;
	private String garden;
	
    KindergartenGarden(String garden, String[] students) {
        this.garden = garden;
        if (students == null) {
        		this.students = new String[] {"Alice", "Bob", "Charlie", "David",
										"Eve", "Fred", "Ginny", "Harriet",
										"Ileana", "Joseph", "Kincaid", "Larry"};
        } else {
        		this.students = students;
        }
    }

    KindergartenGarden(String garden) {
    		this(garden, null);
    }

    List<Plant> getPlantsOfStudent(String student) {
    		String[] gardenLines = garden.split("\n");
    		
    		int index = binarySearch(students, student);
    		
    		if (index == -1)
    			throw new NoSuchElementException(String.format("%s is not in this class", student));

    		int plant1Index = ((1 + index) * 2) - 2;
    		int plant2Index = ((1 + index) * 2) - 1;
    		
    		List<Plant> plants = new ArrayList<Plant>();
    		
    		for (int i = 0; i < gardenLines.length; i++) {
        		plants.add(Plant.getPlant(gardenLines[i].charAt(plant1Index)));
        		plants.add(Plant.getPlant(gardenLines[i].charAt(plant2Index)));	
    		}

    		return plants;
    }
    
    private int binarySearch(String[] arrayToSearch, String stringToSearch) {
    		int low = 0;
    		int high = arrayToSearch.length - 1;
    		int mid;
    		
    		while (low <= high) {
    			mid = (low + high) / 2;
    			if (arrayToSearch[mid].compareTo(stringToSearch) < 0)
    				low = mid + 1;
    			else if (arrayToSearch[mid].compareTo(stringToSearch) > 0)
    				high = mid - 1;
    			else
    				return mid;
    		}
    		
    		return -1;
    }

}
