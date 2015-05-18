package edu.hm.cs.swe2.GeometricFigure;

public abstract class  GeometricFigure {

	private int xOffset;
	private String infotext;
	

	public String toString() {
		return this.infotext;
	
	}
	
	
	
//	public double girthTriangle(){
//		double result;
//		result = 
//		return result;
//	}

	public void printFigureInformation() {
		System.out.println(this.toString());
	}

	public abstract String graphicsToString();

	public abstract String printGraphics();

	public int getxOffset() {
		return xOffset;
	}

	public void setxOffset(int xOffset) {
		this.xOffset = xOffset;
	}
	
}
