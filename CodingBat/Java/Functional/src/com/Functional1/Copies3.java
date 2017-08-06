package com.Functional1;

/*Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Copies3 {

	public static void main(String[] args) {
		
		String[] strArr = {"a", "bb", "ccc"};
		List<String> strings = Arrays.asList(strArr);
		
		System.out.println(copies3(strings));
	}

	public static List<String> copies3(List<String> strings) {
		return strings.stream()
			.map(s -> String.join("", Collections.nCopies(3, s)))
			.collect(Collectors.toList());
	}
}
