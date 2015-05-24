package edu.hm.cs.swe2.GeometricFigure;

public class Trieangle extends GeometricFigure implements IPrintable, Cloneable {
	private double xExtent;
	private double height;


	public Trieangle(int xOffset, double xExtent, double hight) {
		super(xOffset, "Dreieck");
		this.xExtent = xExtent;
		this.height = height;

	}

	public Trieangle(Trieangle originalTrie) {
		// Oberer Konstruktor wird hier verwendet mit orginalen Objektvariablen
		this(originalTrie.xOffset, originalTrie.xExtent, originalTrie.height);

	}

	@Override
	public double girth() {
		double result;
		// U = 2a+c => 2x7 + X => 14+X

		result = 4.0 * xExtent / 2;

		return result;
	}

	// c = 2.sqrt{a^2 - h^2} => A = 0.5xcxh => 0,5c.4 => 0.5x11.5x4=23
	@Override
	public double area() {
		double result;

		result = xExtent * height;

		return result;
	}

	public String graphicsToString() {
		
		String output = "";
		int slopeOffset = (xExtent - 1) / 2;
		for (int j = 0; j < hight; j++) {
			for (int i = 0; i < xOffset + slopeOffset; i++) {
				output += " ";
			}
			for (int i = 0; i < xExtent - 2 * slopeOffset; i++) {
				output += "*";
			}
			output += "\n";
			slopeOffset--;
		}
		output += "\n";

		return output;
	}

		int xExtent = (int) ((height - 1) / 2);
		for (int j = 0; j < xExtent; j++) {
			for (int i = 0; i < xOffset + xExtent; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < height - 2 * xExtent; i++) {
				System.out.print("*");
			}
			System.out.println();
			xExtent--;
		}


	public void printGraphics() {
		System.out.println(graphicsToString());

	}

	public double getHight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getExtent() {
		return this.xExtent;
	}

	public void setExtent(int xExtent) {
		this.xExtent = xExtent;
	}

	@Override
	public String toString() {

		return super.toString();

	}

	@Override
	public boolean equals(Object object) {
		// 1) Vergleich auf Identität
		if (this == object) {
			return true;
		}
		// 2-a Wertgleiche Basisklassenobjekzte
		if (!super.equals(object))
			return false;
		// 2-b Vergleich mit Null
		if (object == null)
			return false;
		// 3. Testen auf selben Typ
		if (getClass() != object.getClass())
			return false;
		// 4) Paarweiser Vergleich der Attribute
		Trieangle other = (Trieangle) object;
		// 5. Attribute mit primitivem Datentyp (int)
		if (height != other.height)
			return false;
		if (xExtent != other.xExtent)
			return false;
		// 6. Refernce Typen Vergleich
//		if (infotext == null) {
//			if (other.infotext != null)
//				return false;
//		} else if (!infotext.equals(other.infotext))
//			return false;

		return true;

	}

	@Override
	public int hashCode() {
		final int prime = 32;
		int result = 1;
		result = (int) (prime * result + height);
		result = (int) (prime * result + xExtent);
		result = prime * result
				+ ((infotext == null) ? 0 : infotext.hashCode());
		return result;

	}
}
