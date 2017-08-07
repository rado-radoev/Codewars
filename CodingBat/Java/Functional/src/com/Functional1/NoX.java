package com.Functional1;

/*Given a list of strings, return a list where each string has all its "x" removed.*/

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Arrays;

public class NoX {

	public static void main(String[] args) {
		String[] strs = {"vox", "mox", "pox"};
		List<String> strss = Arrays.asList(strs);
		System.out.println(nox(strss));
	}

	public static String nox(String strings) {
		return strings.chars()
			.mapToObj(i -> (char)i)
			.filter(c -> c != 'x')
			.map(i -> i.toString())
			.collect(Collectors.joining(""));
	}
	
	public static List<String> nox(List<String> strings) {
		return strings.stream()
			.map(c -> c.chars().mapToObj(x -> (char)x).filter(y -> y != 'x').map(i -> i.toString()).collect(Collectors.joining("")))
			.collect(Collectors.toList());
					
					
	}
}
