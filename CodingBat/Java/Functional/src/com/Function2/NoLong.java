package com.Function2;

/*Given a list of strings, return a list of the strings, omitting any string length 4 or more.*/
import java.util.List;
import java.util.stream.Collectors;

public class NoLong {

	public static void main(String[] args) {

	}
	
	
	public static List<String> noLong (List<String> strings) {
		return strings.stream()
			.filter(s -> s.length() < 4)
			.collect(Collectors.toList());
		//strings.removeIf(s -> s.length() >= 4);
		//return strings;
	}

}
