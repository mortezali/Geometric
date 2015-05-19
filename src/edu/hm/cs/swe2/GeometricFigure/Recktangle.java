package edu.hm.cs.swe2.GeometricFigure;

public class Recktangle extends GeometricFigure {

	private double xExtent;
	private double yExtent;
	private boolean quader = true;

	public Recktangle(int xOffset, double x, double y) {
		super(xOffset);
		this.xExtent = x;
		this.yExtent = y;
		

	}

	public double girthReckangle() {
		double result;
		{
			if (!this.quader)
				result = 2 * xExtent + 2 * yExtent;
		}
		{

			result = 4 * xExtent;
		}

		return result;
	}

	public double areaRecktangle() {
		double result;
		{
			if (!this.quader)

				result = xExtent * yExtent;
		}
		{

			result = xExtent * xExtent;
		}
		return result;
	}

	@Override
	public void graphicsToString() {
		System.out.println("Der nächste Figur ist ein Rechteck" + 
				"----------------------------------------------------------------------------------\n" +
				"Fläche: " + areaRecktangle() + "\n" + 
				"Umfang: " + girthReckangle() + "Der Mittelpunkt des Rechtecks liegt " + getxOffset() + "Längeneinheiten vom linken Rand entfernt.");


		{
			if (this.quader)
				System.out.println("Dieser Figur ist sogar ein Quadrat");
		}

	}

	@Override
	public void printGraphics() {
		
		 int xExtent =1;
		  int yExtent = 1;
		  

			  StringBuilder memoryString = new StringBuilder();

			  // < in <= ge�ndert
			  for (yExtent = 1; yExtent <= xExtent; yExtent++) {
			   // row = 1;

			   for (xExtent = 1; xExtent - yExtent <= xExtent - 2; xExtent++) {
			    if (xExtent + yExtent <= xExtent - 1)
			     memoryString.append(" ");

			    else if (xExtent - yExtent < xExtent - 2 && !(xExtent == yExtent))
			     memoryString.append("*");

			    else if (xExtent - yExtent == xExtent - 2 && !(xExtent == yExtent))
			     memoryString.append("*\n");

			   }

//			   if (column == xExtent) {
//			    int middle = (int) ((yExtent + 1) / 2);
//
//			    for (row = 1; row <= middle + (getTrunkTickness() / 2); row++) {
//
//			     if (middle - (getTrunkTickness() / 2) > row)
//			      memoryString.append(" ");
//			     else
//			      memoryString.append("I");
			    }
			   

			  //return memoryString.toString();
		  }

	

	public boolean isQuader() {
		return true;
	}

	public boolean setQuader(boolean quader) {
		this.quader = true;
		return quader;
	}

}
