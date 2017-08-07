package com.Function2;

/*Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.*/
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Square56 {

	public static void main(String[] args) {
		Integer[] arr = {1};
		List<Integer> nums = Arrays.asList(arr);
		System.out.println(square56(nums));
		
	}

	public static List<Integer> square56(List<Integer> nums) {
		return nums.stream()
					.map(i -> (i * i) + 10)
					.filter(ii -> ii % 10 != 5 && ii % 10 != 6)
					.collect(Collectors.toList());
	}
}
