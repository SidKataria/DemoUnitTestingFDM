package com.fdmgroup.demounittesting.source;

public class ShapeShifter {
	
	public static final int BOUNDARY = 20;

	public Circle squareToCircle(Square square) {
		
		Circle circle = null;
		
		//Fitting the circle inside the square
		if (square.getSide() > BOUNDARY)  	
			circle = new Circle((double) square.getSide() / 2);
		//Fitting the square inside the circle
		else 	
			circle = new Circle(square.getDiagonal() / 2);
		
		return circle;
	}
}
