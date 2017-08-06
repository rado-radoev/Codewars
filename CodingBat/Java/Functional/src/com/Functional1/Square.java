package com.Functional1;

/*Given a list of integers, return a list where each integer is multiplied with itself.*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Square {

	public static void main(String[] args) {
		System.out.println();
	}
	
	public static List<Integer> square(List<Integer> nums) {
		return nums.stream()
			.map(n -> n * n)
			.collect(Collectors.toList());
	}

}
