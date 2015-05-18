package edu.hm.cs.swe2.GeometricFigure;

public class Recktangle extends GeometricFigure {

	private double x;
	private double y;
	private boolean quader;

	public Recktangle(double x, double y, boolean quader) {

		super();

	}

	public double girthReckangle() {
		double result;
		{
			if (!this.quader)
				result = 2 * x + 2 * y;
		}
		{

			result = 4 * x;
		}

		return result;
	}

	public double areaRecktangle() {
		double result;
		{
			if (!this.quader)

				result = x * y;
		}
		{

			result = x * x;
		}
		return result;
	}

	@Override
	public void graphicsToString() {
		System.out.println("Fläche: " + areaRecktangle());
		System.out.println("Zmfang: " + girthReckangle());

		{
			if (this.quader)
				System.out.println("Dieser Figur ist sogar ein Quadrat");
		}

	}

	@Override
	public void printGraphics() {

	}

}
