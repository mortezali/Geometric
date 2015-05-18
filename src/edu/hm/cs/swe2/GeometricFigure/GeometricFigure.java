package edu.hm.cs.swe2.GeometricFigure;

public abstract class GeometricFigure {

	private int xOffset;
	private String infotext;

	public String toString() {
		return this.infotext;

	}

	public void printFigureInformation() {
		System.out.println(this.toString());
	}

	public abstract void graphicsToString();

	public abstract void printGraphics();

	public int getxOffset() {
		return xOffset;
	}

	public void setxOffset(int xOffset) {
		this.xOffset = xOffset;
	}

}
