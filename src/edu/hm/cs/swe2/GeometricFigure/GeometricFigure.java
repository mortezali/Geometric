package edu.hm.cs.swe2.GeometricFigure;

public abstract class GeometricFigure {
	
	protected int xOffset;
	protected String infotext;

	public String getInfotext() {
		return infotext;
	}

	public void setInfotext(String infotext) {
		this.infotext = infotext;
	}

	public GeometricFigure(int xOffset, String infotext) {

		this.xOffset = xOffset;
		this.infotext = infotext;

	}

	public String toString() {
		return ("Der nächste Figur ist ein" + getInfotext()
				+ "----------------------------------------------------------------------------------\n"
				+ "Fläche: " + area() + "\n" + "Umfang: "
				+ girth() + "Der Mittelpunkt des kreises liegt "
				+ getxOffset()
				+ "Längeneinheiten vom linken Rand entfernt.");

	}

	public void printFigureInformation() {
		System.out.println(toString());
	}
	
	public abstract double girth();
	
	public abstract double area();

	public int getxOffset() {
		return xOffset;
	}

}
