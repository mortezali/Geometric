package edu.hm.cs.swe2.GeometricFigure;

public class Trieangle extends GeometricFigure {
	private double xExtent;
	private double hight;

	public Trieangle(int xOffset, double xExtent, double hight) {
		super(xOffset);
		this.xExtent = xExtent;
		this.hight = hight;

	}

	public double girthTrieangle() {
		double result;
		//U = 2a+c => 2x7 + X => 14+X

		result = 4 * xExtent / 2;

		return result;
	}
	// A = 0.5xcxh => 0,5c.4

	public double areaTrieangle() {
		double result;

		result = xExtent * hight;

		return result;
	}

	@Override
	public void graphicsToString() {
		System.out.println("Der nächste Figur ist ein Dreieck" + 
				"----------------------------------------------------------------------------------\n" +
				"Fläche: " + areaTrieangle() + "\n" + 
				"Umfang: " + girthTrieangle() + "Der Mittelpunkt des Dreiecks liegt " + getxOffset() + "Längeneinheiten vom linken Rand entfernt.");


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
		return this.xExtent;
	}

	public void setExtent(double xExtent) {
		this.xExtent = xExtent;
	}

}
