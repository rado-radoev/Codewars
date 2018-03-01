import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Matrix {
	
	List<List<Integer>> values;

    Matrix(List<List<Integer>> values) {
    		this.values = values;
    }

    Set<MatrixCoordinate> getSaddlePoints() {
    	
    		int row = 0;
    		Set<MatrixCoordinate> expectedSaddlePoints = new HashSet<>();
    		List<MatrixCoordinate> s = new ArrayList<MatrixCoordinate>();
    		
    		for (List<Integer> line : values) {
    			
    			int rowMax = line.get(0);
    			int colIndex = 0;
    			boolean saddlePoint = true;
    			
    			// Finding largest element in row
    			for (int i = 0; i < line.size(); i++) {
    				if (line.get(i) > rowMax) {
    					rowMax = line.get(i);
    					colIndex = i;
    				}
    			}
    			
    			for (int i = 0; i < values.size(); i++) {
    				if (values.get(i).get(colIndex) < rowMax) {
    					saddlePoint = false;
    					break;
    				}
    			}

    			if (saddlePoint) {
    				s.add(new MatrixCoordinate(row, colIndex));
    				expectedSaddlePoints = new HashSet<>(s);
    			} 
    			
    			row++;
    		}
    		 
    		return expectedSaddlePoints;
    }
}
