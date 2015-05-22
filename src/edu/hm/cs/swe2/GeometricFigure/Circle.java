package edu.hm.cs.swe2.GeometricFigure;

public class Circle extends GeometricFigure {
	private double radius;

	public Circle(int xOffset, double radius) {
		super(xOffset, "Kreis");
		this.radius = radius;

	}
	public Circle(Circle origCircle){
		this(origCircle.xOffset, origCircle.radius);
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
		result = getRadius() * getRadius() * Math.PI;
		return result;
		
	}
	

	public void printFigureInformation() {
		System.out.println(this.toString()  
				
				+ "\n\n"+ "Der Mittelpunkt des kreises liegt "
				+ getxOffset() + getRadius()
				+ "Längeneinheiten vom linken Rand entfernt.");
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	//equals()
		//hashCode()
}
