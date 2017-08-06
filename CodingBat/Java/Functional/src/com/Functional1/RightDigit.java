package com.Functional1;

/*Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)*/
import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {

	public static void main(String[] args) {

	}
	
	public static List<Integer> rightDigit(List<Integer> nums) {
		return nums.stream()
			.map(n -> n % 10)
			.collect(Collectors.toList());
	}

}
