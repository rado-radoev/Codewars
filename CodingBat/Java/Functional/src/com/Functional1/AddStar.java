package com.Functional1;

/*Given a list of strings, return a list where each string has "*" added at its end.*/
import java.util.List;
import java.util.stream.Collectors;

public class AddStar {

	public static void main(String[] args) {
		
	}

	
	public static List<String> addStar(List<String> strings) {
		return strings.stream()
			.map(n -> n + "*")
			.collect(Collectors.toList());
	}
}
