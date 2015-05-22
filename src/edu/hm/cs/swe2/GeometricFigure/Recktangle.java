package edu.hm.cs.swe2.GeometricFigure;

public class Recktangle extends GeometricFigure implements IPrintable {

	private double xExtent;
	private double yExtent;
	private boolean quader = false;

	public Recktangle(int xOffset, double x, double y) {
		super(xOffset, "Rechteck");
		this.xExtent = x;
		this.yExtent = y;

		if (this.xExtent == yExtent) {
			this.quader = true;
		}

	}
	
	public Recktangle(Recktangle originalReckt){
		this(originalReckt.xOffset, originalReckt.xExtent, originalReckt.yExtent);
	}

	public Recktangle(int xOffset, double x) {

		this(xOffset, x, x);

	}

	@Override
	public double girth() {
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

	@Override
	public double area() {
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

	public String graphicsToString() {
	 

	
	 int xExtent = 1;
	 int yExtent = 1;
	
	 StringBuilder memoryString = new StringBuilder();{
	
	 for (yExtent = 1; yExtent <= xExtent; yExtent++) {
	 xExtent = 1;
	
	 for (xExtent = 1; xExtent - yExtent <= xExtent - 2; xExtent++) {
	 if (xExtent + yExtent <= xExtent - 1)
	 memoryString.append(" ");
	
	 else if (xExtent - yExtent < xExtent - 2 && !(xExtent == yExtent))
	 memoryString.append("*");
	
	 else if (xExtent - yExtent == xExtent - 2 && !(xExtent == yExtent))
	 memoryString.append("*\n");
	
	 }
	 }

	 if (yExtent == xExtent) {
	 int middle = (int) ((yExtent + 1) / 2);
	
	 for (xExtent = 1; xExtent <= middle + (girth() / 2); xExtent++) {
	
	 if (middle - (girth() / 2) > xExtent)
	 memoryString.append(" ");
	 else
	 memoryString.append("*");
	 }
	 }
	
	return memoryString.toString();
	 }
	}
	@Override
	public String toString() {

		String output = super.toString();

		if (this.quader) {

			output += "Dieser Figur ist sogar ein Quadrat";
		}

		return output;
	}
	
	public boolean setQuader(boolean quader) {
		this.quader = true;
		return quader;
	}


	public void printGraphics() {
		
		System.out.println(graphicsToString());

	}

	@Override
	public void printFigureInformation(){
		
		super.printFigureInformation();
		printGraphics();
	}
	
	//equals()
	//hashCode()
}
