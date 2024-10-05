package com.tut4.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

//	@Test
//	void test1() {
//		
//		int[] numbers= {1,2,3};
//		// Instance of the function
//		MyMath math = new MyMath();
//		int result = math.calculateSum(numbers);		
//		System.out.println(result);
//		int expectedResult = 6;
//		assertEquals(expectedResult, result);
//		// Absence of failure is success
//		// Test Condition or Assert
//	}
	
	// Instance of the function
	private MyMath math = new MyMath();
	
	@Test
	void calculateSum_ThreeMemberArray() {
		
		assertEquals(6, math.calculateSum(new int[] {1,2,3}));
		// Absence of failure is success
		// Test Condition or Assert
	}
	
	@Test
	void calculateSum_ZeroLengthArray() {
		
		assertEquals(0, math.calculateSum(new int[] {}));
		// Absence of failure is success
		// Test Condition or Assert
	}

}
