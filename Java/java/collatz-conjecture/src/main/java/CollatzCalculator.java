class CollatzCalculator {

    int computeStepCount(int start) {
    		if (start <= 0)
    			throw new IllegalArgumentException("Only natural numbers are allowed");
        return (computeStepCount(start, 0));
    }

    int computeStepCount(int start, int count) {
    		if (start == 1)
    			return count;
    		
    		count++;
    		
    		if (start % 2 == 0)
    			start /= 2;
    		else
    			start = (start * 3) + 1;
    		
    		return computeStepCount(start, count);
    }
}
