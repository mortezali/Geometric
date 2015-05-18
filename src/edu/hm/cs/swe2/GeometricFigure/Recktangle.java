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
		System.out.println("Der nächste Figur ist ein Kreis" + 
				"----------------------------------------------------------------------------------\n" +
				"Fläche: " + areaRecktangle() + "\n" + 
				"Umfang: " + girthReckangle() + "Der Mittelpunkt des kreises liegt " + getxOffset() + "Längeneinheiten vom linken Rand entfernt.");


		{
			if (this.quader)
				System.out.println("Dieser Figur ist sogar ein Quadrat");
		}

	}

	@Override
	public void printGraphics() {
		
		System.out.println();

	}

}
