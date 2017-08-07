package com.Function2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.*/

public class NoTeen {

	public static void main(String[] args) {
		Integer[] ints = {12, 13, 19, 20};
		List<Integer> nums = Arrays.asList(ints);
		System.out.println(noTeen(nums));

	}
	
	public static List<Integer> noTeen(List<Integer> nums) {
		return nums.stream()
			.filter(i -> (i < 13 || i > 19))
			.collect(Collectors.toList());
		
		
		  //nums.removeIf(n -> n >= 13 && n <= 19);
		  //return nums;
	}

}
