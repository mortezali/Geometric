package edu.hm.cs.swe2.GeometricFigure;

public class Trieangle extends GeometricFigure {
	private double xExtent;
	private double hight;

	public Trieangle(double x, double y) {
		super();
		this.setExtent(x);
		this.setHight(y);

	}

	public double girthTrieangle() {
		double result;
		//U = 2a+c => 2x7 + X => 14+X

		result = 2* xExtent + hight;

		return result;
	}
	// A = 0,5.c.h => 0,5c.4

	public double areatrieangle() {
		double result;

		result = xExtent * xExtent;

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
		return xExtent;
	}

	public void setExtent(double extent) {
		this.xExtent = xExtent;
	}

}
