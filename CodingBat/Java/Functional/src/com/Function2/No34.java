package com.Function2;

/*Given a list of strings, return a list of the strings, omitting any string length 3 or 4.*/
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class No34 {

	public static void main(String[] args) {
		String[] arr = {"a", "bb", "ccc"};
		List<String> strings = Arrays.asList(arr);
		System.out.println(no34(strings));
	}

	public static List<String> no34(List<String> strings) {
		return strings.stream()
			.filter(s -> s.length() < 3 || s.length() > 4)
			.collect(Collectors.toList());
	}
}
