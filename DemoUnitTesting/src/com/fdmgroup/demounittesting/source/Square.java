package com.fdmgroup.demounittesting.source;

public class Square {

	private int side;
	
	/*
	 * Constructor
	 */
	public Square(int side) {
		this.side = Math.abs(side);
	}

	/*
	 * getSide
	 * Method to obtain private 'side' field
	 */
	public int getSide() {
		return side;
	}
		
	/*
	 * getArea
	 * Method to obtain area of square
	 */
	public int getArea() {
		return side*side;
	}

	/*
	 * getPerimeter
	 * Method to obtain square's perimeter
	 */
	public int getPerimeter() {
		return 4 * side;
	}

	/*
	 * getDiagonal
	 * method to obtain the value of the square's diagonal
	 */
	public double getDiagonal() {
		return Math.sqrt(2) * side;
	}
	
}
