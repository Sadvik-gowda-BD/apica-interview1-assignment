package com.apica.assignment.assignment4_stream;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestStreamAssignment {

	private static final List<Integer> NUMBERS = Arrays.asList(2, 5, 67, -3, 34, 12, 65, 101);
	
	@Test
	void testGetOddNumbers() {
		
		List<Integer> oddNumbers = StreamAssignment.getOddNumbers(NUMBERS);
		
		Assertions.assertEquals(5, oddNumbers.size());
		
		for (Integer number : oddNumbers) {
			Assertions.assertTrue(number % 2 != 0, number + " is not an odd numer");
		}
	}
}
