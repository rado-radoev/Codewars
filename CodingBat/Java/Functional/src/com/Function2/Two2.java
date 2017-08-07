package com.Function2;

/*Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Two2 {

	public static void main(String[] args) {
		Integer[] ints = {2, 6, 11};
		List<Integer> nums = Arrays.asList(ints);
		System.out.println(two2(nums));
	}

	public static List<Integer> two2(List<Integer> nums) {
		return nums.stream()
					.map(i -> i * 2)
					.filter(i -> i % 10 != 2)
					.collect(Collectors.toList());
	}
}
