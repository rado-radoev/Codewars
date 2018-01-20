import java.util.ArrayList;
import java.util.List;

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
    	
    		int index = 0;
    		for (; index < students.length; index++) {
    	   		if (student.equals(students[index])) {
    	   			break;
    	   		}
       }
    		
    		List<Plant> plants = new ArrayList<Plant>();
    		
    		int plant2Index = ((1 + index) * 2) - 1;
    		int plant1Index = ((1 + index) * 2) - 2;
    		   		
    		plants.add(Plant.getPlant(gardenLines[0].charAt(plant1Index)));
    		plants.add(Plant.getPlant(gardenLines[0].charAt(plant2Index)));
    		
    		plants.add(Plant.getPlant(gardenLines[1].charAt(plant1Index)));
    		plants.add(Plant.getPlant(gardenLines[1].charAt(plant2Index)));
    		
    		return plants;
    }

}
