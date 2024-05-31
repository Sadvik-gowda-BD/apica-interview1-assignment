package com.apica.assignment.assignment4_stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAssignment {

	public static List<Integer> getOddNumbers(List<Integer> numbers) {
		//Implement filtering of List and return a List containing only odd numbers using a stream.
		if(numbers != null){
			return numbers.stream()
					.filter(num -> num%2 != 0)
					.collect(Collectors.toList());
		}
		return Collections.emptyList();
	}
}
