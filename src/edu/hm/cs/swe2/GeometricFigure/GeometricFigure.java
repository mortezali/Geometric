package edu.hm.cs.swe2.GeometricFigure;

public abstract class GeometricFigure {
	
	protected static int xOffset;
	protected String infotext;

	public GeometricFigure(int xOffset) {

		GeometricFigure.xOffset = xOffset;

	}

	public String toString() {
		return infotext;

	}

	public void printFigureInformation() {
		System.out.println(toString());
	}

	public abstract void graphicsToString();

	public abstract void printGraphics();
	
	public abstract double girth();
	
	public abstract double area();

	public static int getxOffset() {
		return xOffset;
	}

}
