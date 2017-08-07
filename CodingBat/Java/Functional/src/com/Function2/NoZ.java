package com.Function2;

/*Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class NoZ {

	public static void main(String[] args) {
		String[] stringz = {"aaa", "bbb", "aza"};
		List<String> strz = Arrays.asList(stringz);
		//System.out.println(stringz[2].contains("z"));
		System.out.println(noZ(strz));
	}

	public static List<String> noZ(List<String> strings) {
		return strings.stream()
					.filter(s -> !s.contains("z"))
					.collect(Collectors.toList());
	}
}
