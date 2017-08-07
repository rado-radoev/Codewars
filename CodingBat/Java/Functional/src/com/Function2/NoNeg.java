package com.Function2;

/*Given a list of integers, return a list of the integers, omitting any that are less than 0.*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class NoNeg {

	public static void main(String[] args) {
		Integer[] ints = {1,-4,5,20,-9, 6, 98, - 100};
		List<Integer> nums = Arrays.asList(ints); 
	}
	
	public static List<Integer> noNeg(List<Integer> nums) {
		return nums.stream()
			.filter(i -> i >= 0)
			.collect(Collectors.toList());
	}

}
