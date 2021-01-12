package com.fdmgroup.demounittesting.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fdmgroup.demounittesting.source.Square;

class SquareTest {

	private Square classUnderTest;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetSideOnSquareInitializedToSideFive() {
		//arrange
		classUnderTest = new Square(5);
		int expected = 5;
		
		//act
		int actual = classUnderTest.getSide();
		
		//assert
		assertEquals(expected, actual);
	}
	
	@Test
	void testGetSideOnSquareInitializedToSideNegativeFive() {
		//arrange
		classUnderTest = new Square(-5);
		int expected = 5;
		
		//act
		int actual = classUnderTest.getSide();
		
		//assert
		assertEquals(expected, actual);	
	}

	@Test
	void testGetAreaOnSquareInitializedToSideLengthFive() {
		//arrange
		classUnderTest = new Square(5);
		int expected = 25;
		
		//act
		int actual = classUnderTest.getArea();
		
		//assert
		assertEquals(expected, actual);
	}
	
	@Test
	void testGetPerimeterOnSquareInitializedToSideLengthFive() {
		//arrange
		classUnderTest = new Square(5);
		int expected = 20;
		
		//act
		int actual = classUnderTest.getPerimeter();
		
		//assert
		assertEquals(expected, actual);
	}
	
	@Test
	void testGetDiagonalOnSquareInitializedToSideLengthFive() {
		//arrange
		classUnderTest = new Square(5);
		double expected = 7.07;
		
		//act
		double actual = classUnderTest.getDiagonal();
		
		//assert
		assertEquals(expected, actual, 0.00107);
	}
}
