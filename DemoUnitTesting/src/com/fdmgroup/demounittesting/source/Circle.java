package com.fdmgroup.demounittesting.source;

public class Circle {
	
	private double radius;

	public Circle(double radius) {
		this.radius = Math.abs(radius);
	}

	public double getRadius() {
		return radius;
	}

}
