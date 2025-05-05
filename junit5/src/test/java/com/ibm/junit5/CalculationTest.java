package com.ibm.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculationTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each ");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each ");
	}

	@Test
	void testSum() {
		int expected=6;
		Calculator calculator=new Calculator();
		int actual=calculator.sum(4,2);
		assertEquals(expected,actual);
	}
	@Test
	void testDivide(){
		int expected=2;
		Calculator calculator=new Calculator();
		int actual=calculator.divide(4,2);
		assertEquals(expected,actual);
	}
	@Test
	void testDivideByZeroException() {
		
         System.out.println("Divide");
         Calculator calculator=new Calculator();
         ArithmeticException exception=assertThrows(ArithmeticException.class,()->calculator.divide(10,0),"Expected divide()to throw , but it didnot");
         assertEquals("/ by zero",exception.getMessage());
	}
	@Test
	 void testSlowMethodPerformance() {
		// TODO Auto-generated method stub
       Calculator calculator=new Calculator();
       assertTimeout(Duration.ofMillis(100),()->calculator.getConnection());
	}
	@ParameterizedTest
	@ValueSource(ints= {2,4,6,8,10})
	void testIsEvenNumbers(int number) {
		assertTrue(Calculator.isEven(number));
	}
	@ParameterizedTest
	@ValueSource(ints= {1,3,5,7,9})
	void testIsOddNumbers(int number) {
		assertTrue(Calculator.isOdd(number));
	}
	


    

}
