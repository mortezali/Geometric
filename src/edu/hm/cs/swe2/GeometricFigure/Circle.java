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
		System.out
				.println("Der nächste Figur ist ein Kreis"
						+ "----------------------------------------------------------------------------------\n"
						+ "Fläche: " + area() + "\n" + "Umfang: "
						+ girth() + "Der Mittelpunkt des kreises liegt "
						+ getxOffset()
						+ "Längeneinheiten vom linken Rand entfernt.");

	}

	@Override
	public void printGraphics() {

	}

	public String toString() {
		return infotext;
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
