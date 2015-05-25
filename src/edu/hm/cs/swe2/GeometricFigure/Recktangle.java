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
	
	 StringBuilder graphicToString = new StringBuilder();{
	
	 for (yExtent = 1; yExtent <= xExtent; yExtent++) {
	 xExtent = 1;
	
	 for (xExtent = 1; xExtent - yExtent <= xExtent - 2; xExtent++) {
	 if (xExtent + yExtent <= xExtent - 1)
		 graphicToString.append(" ");
	
	 else if (xExtent - yExtent < xExtent - 2 && !(xExtent == yExtent))
		 graphicToString.append("*");
	
	 else if (xExtent - yExtent == xExtent - 2 && !(xExtent == yExtent))
		 graphicToString.append("*\n");
	
	 }
	 }

	 if (yExtent == xExtent) {
	 int middle = (int) ((yExtent + 1) / 2);
	
	 for (xExtent = 1; xExtent <= middle + (girth() / 2); xExtent++) {
	
	 if (middle - (girth() / 2) > xExtent)
		 graphicToString.append(" ");
	 else
		 graphicToString.append("*");
	 }
	 }
	
	return graphicToString.toString();
	 }
	}
	@Override
	public String toString() {

		String output = super.toString();

		if (this.quader) {

			output += " \nDieser Figur ist sogar ein Quadrat";
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
	public boolean equals(Object object){
		//1) Vergleich auf Identität
		if(this == object){
		return true;
		}
		//2-a Wertgleiche Basisklassenobjekzte
		if(!super.equals(object)) 
			return false;
		//2-b Vergleich mit Null
		if(object == null) 
			return false;
		// 3. Testen auf selben Typ
		if(getClass() != object.getClass())
			return false;
		// 4) Paarweiser Vergleich der Attribute
		GeometricFigure other = (GeometricFigure) object;
		// 5. Attribute mit primitivem Datentyp (int)
		if (xOffset != other.xOffset)
			return false;
		//6. Refernce Typen Vergleich
//		if(infotext == null){
//			if(other.infotext != null)
//				return false;
//		}
//		else if(!infotext.equals(other.infotext))
//			return false;
//		
		return true;
		
	}
	
	@Override
	public int hashCode(){
		final int prime = 32;
		int result = 1;
		result = prime * result + xOffset;
		result = prime * result + ((infotext == null) ? 0 : infotext.hashCode());
		return result;
		
	}
	
	@Override
	public void printFigureInformation() {
//		System.out.println(toString());
		super.printFigureInformation();
		System.out.println(graphicsToString());
		
		
	}
}
