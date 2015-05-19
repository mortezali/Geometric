package edu.hm.cs.swe2.GeometricFigure;

public abstract class GeometricFigure {

	protected static int xOffset;
	protected static String infotext;
	
	public GeometricFigure( int xOffset){
		
		this.xOffset = xOffset;
		
	}

	public String toString() {
		return getInfotext();

	}

	public void printFigureInformation() {
		System.out.println(toString());
	}

	public abstract void graphicsToString();

	public abstract void printGraphics();

	public static int getxOffset() {
		return xOffset;
	}

	public void setxOffset(int xOffset) {
		this.xOffset = xOffset;
	}

	public String getInfotext() {
		return this.infotext;
	}

	public void setInfotext(String infotext) {
		this.infotext = infotext;
	}

}
