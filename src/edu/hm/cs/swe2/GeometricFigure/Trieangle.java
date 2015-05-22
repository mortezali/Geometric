package edu.hm.cs.swe2.GeometricFigure;

public class Trieangle extends GeometricFigure implements IPrintable, Cloneable{
	private double xExtent;
	private double hight;

	public Trieangle(int xOffset, double xExtent, double hight) {
		super(xOffset, "Dreieck");
		this.xExtent = xExtent;
		this.hight = hight;

	}
	
	public Trieangle (Trieangle originalTrie){
		// Oberer Konstruktor wird hier verwendet mit orginalen Objektvariablen
		this(originalTrie.xOffset, originalTrie.xExtent, originalTrie.hight);
		
	}
	@Override
	public double girth() {
		double result;
		//U = 2a+c => 2x7 + X => 14+X

		result = 4 * xExtent / 2;

		return result;
	}
	// c = 2.sqrt{a^2 - h^2} => A = 0.5xcxh => 0,5c.4 => 0.5x11.5x4=23
	@Override
	public double area() {
		double result;

		result = xExtent * hight;

		return result;
	}


	public String graphicsToString() {
		
		
		return null;
		
		
	}


	public void printGraphics() {
		System.out.println(graphicsToString());

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
	@Override
	public String toString() {

		return super.toString();

		
		}
	
	//equals()
		//hashCode()
}
