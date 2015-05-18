package edu.hm.cs.swe2.GeometricFigure;

public class Recktangle extends GeometricFigure {

	private double extent;
	private double direction;
	private boolean quader;

	public Recktangle(double x, double y, boolean quader) {
		super();
		this.extent = x;
		this.direction = y;
		

	}

	public double girthReckangle() {
		double result;
		{
			if (setQuader(false))
				result = 2 * extent + 2 * direction;
		}
		{

			result = 4 * extent;
		}

		return result;
	}

	public double areaRecktangle() {
		double result;
		{
			if (setQuader(false))

				result = extent * direction;
		}
		{

			result = extent * extent;
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
			if (setQuader(true))
				System.out.println("Dieser Figur ist sogar ein Quadrat");
		}

	}

	@Override
	public void printGraphics() {
		
		System.out.println();

	}

	public boolean isQuader() {
		return true;
	}

	public boolean setQuader(boolean quader) {
		this.quader = true;
		return quader;
	}

}
