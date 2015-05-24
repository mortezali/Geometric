package edu.hm.cs.swe2.GeometricFigure;

public abstract class GeometricFigure {
	
	protected int xOffset;
	protected String infotext;

	public String getInfotext() {
		return infotext;
	}

	public void setInfotext(String infotext) {
		this.infotext = infotext;
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
		if(infotext == null){
			if(other.infotext != null)
				return false;
		}else if(!infotext.equals(other.infotext))
			return false;
		
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

	public GeometricFigure(int xOffset, String infotext) {

		this.xOffset = xOffset;
		this.infotext = infotext;

	}

	public String toString() {
		return ("\n\nDer nächste Figur ist ein " + getInfotext() + "\n"
				+ "----------------------------------------------------------------------------------\n"
				+ "Fläche: " + area() + "\n" + "Umfang: "
				+ girth());

	}

	public void printFigureInformation() {
		System.out.println(toString());
	}
	
	public abstract double girth();
	
	public abstract double area();

	public int getxOffset() {
		return xOffset;
	}

}
