package com.fdmgroup.demounittesting.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.fdmgroup.demounittesting.source.Circle;
import com.fdmgroup.demounittesting.source.ShapeShifter;
import com.fdmgroup.demounittesting.source.Square;

import static org.mockito.Mockito.*;


class ShapeShifterTest {
	
	private ShapeShifter classUnderTest;
	Square mockSquare = null;


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
	void testSquareToCircleReturnCircumscribedCircleOnSquareSideLengthAtBoundary() {
		//arrange
		Square inputSquare = new Square(ShapeShifter.BOUNDARY);
		classUnderTest = new ShapeShifter();
		double expectedCircleRadius = inputSquare.getDiagonal() / 2;
		
		//act
		Circle actualCircle = classUnderTest.squareToCircle(inputSquare);
		
		//assert
		assertEquals(expectedCircleRadius, actualCircle.getRadius() , 0);
	}
	
	@Test
	void testSquareToCircleReturnInscribedCircleOnSquareSideLengthAtBoundary() {
		//arrange
		Square inputSquare = new Square(ShapeShifter.BOUNDARY + 1);
		classUnderTest = new ShapeShifter();
		double expectedCircleRadius = (double) inputSquare.getSide() / 2;
		
		//act
		Circle actualCircle = classUnderTest.squareToCircle(inputSquare);
		
		//assert
		assertEquals(expectedCircleRadius, actualCircle.getRadius() , 0);
	}
	
	@Test
	void testSquareToCircleCallsGetDiagonalOnSquareSideLengthLessThanBoundary() {
		//arrange
		Square mockSquare = mock(Square.class);
		classUnderTest = new ShapeShifter();
		
		//act
		classUnderTest.squareToCircle(mockSquare);
		
		//assert
		verify(mockSquare).getDiagonal();
	}

	@Test
	void testSqaureToCircleCallsGetSideTwiceOnSquareSideLengthGreaterThanBoundary() {
		
		//arrange
		Square mockSquare = mock(Square.class);
		when(mockSquare.getSide()).thenReturn(ShapeShifter.BOUNDARY + 1);
		classUnderTest = new ShapeShifter();
		
		
		//act
		classUnderTest.squareToCircle(mockSquare);
		
		//assert
		verify((mockSquare), times(2)).getSide();
	}
}
