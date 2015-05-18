package edu.hm.cs.swe2.GeometricFigure;

public class Trieangle extends GeometricFigure {
	private double extent;
	private double hight;

	public Trieangle(double x, double y) {
		super();
		this.setExtent(x);
		this.setHight(y);

	}

	public double girthTrieangle() {
		double result;

		result = 4 * extent;

		return result;
	}

	public double areatrieangle() {
		double result;

		result = extent * extent;

		return result;
	}

	@Override
	public void graphicsToString() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printGraphics() {
		// TODO Auto-generated method stub

	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public double getExtent() {
		return extent;
	}

	public void setExtent(double extent) {
		this.extent = extent;
	}

}
