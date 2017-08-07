package com.Function2;

/*Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.*/
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class NoYY {
	
	public static void main(String[] args) {
		String[] arr = {"yyx", "y", "zzz"};
		List<String> strings = Arrays.asList(arr);
		System.out.println(noYY(strings));
	}

	public static List<String> noYY(List<String> strings) {
		return strings.stream()
					.map(s -> s + "y")
					.filter(str -> !str.contains("yy"))
					.collect(Collectors.toList());
					
	}
}
