package com.Function2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. */

public class No9 {

	public static void main(String[] args) {
		Integer[] ints = {9, 19, 23, 3};
		List<Integer> nums = Arrays.asList(ints); 
	}
	
	public static List<Integer> no9(List<Integer> nums) {
		return nums.stream()
			.filter(i -> i % 10 != 9)
			.collect(Collectors.toList());
	}

}
