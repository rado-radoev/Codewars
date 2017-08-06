package com.Functional1;

/*Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).*/
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lower {

	public static void main(String[] args) {

	}

	public static List<String> lower(List<String> strings) {
		return strings.parallelStream()
			.map(String::toLowerCase)
			.collect(Collectors.toList());
	}
}
