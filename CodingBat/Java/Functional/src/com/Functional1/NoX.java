package com.Functional1;

/*Given a list of strings, return a list where each string has all its "x" removed.*/

import java.util.List;
import java.util.Arrays;

public class NoX {

	public static void main(String[] args) {
		String[] strs = {"vox", "mox", "pox"};
		List<String> strss = Arrays.asList(strs);
		nox(strss);
	}

	public static void nox(List<String> strings) {
		strings.stream()
			.map(s -> s.toCharArray())
			.forEach(System.out::println);
	}
}
