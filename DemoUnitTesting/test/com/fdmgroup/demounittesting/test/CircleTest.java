package com.fdmgroup.demounittesting.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fdmgroup.demounittesting.source.Circle;

class CircleTest {
	
	private Circle classUnderTest;

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
	void testGetRadiusOnCircleInitializedToPositiveSeven() {
		//arrange
		classUnderTest = new Circle(7.0);
		double expected = 7.0; 
		
		//act
		double actual = classUnderTest.getRadius();
		
		//assert
		assertEquals(expected, actual, 0);
	}
	
	@Test
	void testGetRadiusOnCircleInitializedToNegativeSeven() {
		//arrange
		classUnderTest = new Circle(-7.0);
		double expected = 7.0; 
		
		//act
		double actual = classUnderTest.getRadius();
		
		//assert
		assertEquals(expected, actual, 0);
	}

}
