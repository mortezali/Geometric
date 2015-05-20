package edu.hm.cs.swe2.GeometricFigure;

public class Circle extends GeometricFigure {
	private static double radius;

	public Circle(int xOffset, double radius) {
		super(xOffset);
		this.radius = radius;;

	}

	@Override
	public double girth() {
		double result;
		result = 2 * Math.PI * getRadius();
		return result;

	}
	@Override
	public double area(){
		double result;
		result = getRadius() * getRadius() * 3.1415;
		return result;
		
	}

	@Override
	public void graphicsToString() {
		System.out.println();
	}

	@Override
	public void printGraphics() {

	}
	@Override
	public String toString() {
		return super.toString() + 

	}

	public void printFigureInformation() {
		System.out.println(this.toString());
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		Circle.radius = radius;
	}
}
