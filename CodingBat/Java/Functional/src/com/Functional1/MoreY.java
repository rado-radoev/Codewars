package com.Functional1;

/*Given a list of strings, return a list where each string has "y" added at its start and end*/
import java.util.List;
import java.util.stream.Collectors;

public class MoreY {

	public static void main(String[] args) {

	}

	public static List<String> moreY(List<String> strings) {
		return strings.stream()
			.map(s -> "y" + s + "y")
			.collect(Collectors.toList());
	}
}
