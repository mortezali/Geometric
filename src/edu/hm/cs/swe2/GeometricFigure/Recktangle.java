package edu.hm.cs.swe2.GeometricFigure;

public class Recktangle extends GeometricFigure {

	private double x;
	private double y;
	private boolean quader;

	public Recktangle(double a, double b) {

		super();

	}

	public double girthReckangle() {
		double result;
		result = 2 * x + 2 * y;
		{
			if (x == y)
				result = 4 * x;
		}
		return result;
	}

	public double areaRecktangle() {
		double result;
		result = x * y;
		{
			if (x == y)
				result = x * x;
		}
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
