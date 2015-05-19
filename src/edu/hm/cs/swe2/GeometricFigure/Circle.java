package edu.hm.cs.swe2.GeometricFigure;

public class Circle extends GeometricFigure {
	private static double radius;

	public Circle(int xOffset, int radius) {
		super (xOffset);

	}

	public static double girthCircle() {
		double result;
		result = 2 * 3.1415 * radius;
		return result;

	}

	public static double areaCircle() {
		double result;
		result = radius * radius * 3.1415;
		return result;
	}

	@Override
	public void graphicsToString() {

		
	}

	@Override
	public void printGraphics() {

	}
	public String toString(){
		System.out.println("Der nächste Figur ist ein Kreis" + 
				"----------------------------------------------------------------------------------\n" +
				"Fläche: " + areaCircle() + "\n" + 
				"Umfang: " + girthCircle() + "Der Mittelpunkt des kreises liegt " + getxOffset() + "Längeneinheiten vom linken Rand entfernt.");
		return infotext;

	}
	
	public void printFigureInformation() {
		System.out.println(this.toString());
	}
}
