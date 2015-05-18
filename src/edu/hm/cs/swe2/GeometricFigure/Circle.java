package edu.hm.cs.swe2.GeometricFigure;

public class Circle extends GeometricFigure{
	private double radius;

	
	
	public Circle(int radius){
		super();
		
	}
	public double girthCircle(){
		double result;
		 result = 2*3.1415*radius;
		return result;
		
	}
	public double areaCircle(){
		double result;
		result = radius*radius*3.1415;		
		return result;
	}
	
	
	@Override
	public String graphicsToString() {
		return graphicsToString();
	}

	@Override
	public String printGraphics() {
	
		return printGraphics();
	}
	
	

}
