package edu.hm.cs.swe2.GeometricFigure;

public class Circle extends GeometricFigure {
	private double radius;

	public Circle(int xOffset, double radius) {

	super(xOffset, "Kreis");
		this.radius = radius;

	}
	public Circle(Circle origCircle){
		this(origCircle.xOffset, origCircle.radius);
	}

	//Umfang = 2 * pi * Radius
	@Override
	public double girth() {
		double resultgirth;
		resultgirth = 2 * Math.PI * getRadius();
		return resultgirth;

	}
	

	@Override
	public double area(){
		double resultarea;
		resultarea = getRadius() * getRadius() * Math.PI;
		return resultarea;
		
	}
	

	public void printFigureInformation() {
		System.out.println(this.toString()  
				
				+ "\n\n"+ "Der Mittelpunkt des kreises liegt "
				+ getxOffset() + getRadius()
				+ " Längeneinheiten vom linken Rand entfernt. ");
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
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
		Circle other = (Circle) object;
		// 5. Attribute mit primitivem Datentyp (int)
		if (radius != other.radius)
			return false;
		//6. Refernce Typen Vergleich
//		if(infotext == null){
//			if(other.infotext != null)
//				return false;
//		}else if(!infotext.equals(other.infotext))
//			return false;
		
		return true;
		
	}
	
	@Override
	public int hashCode(){
		final int prime = 32;
		int result = 1;
		result = (int) (prime * result + radius);
		result = prime * result + ((infotext == null) ? 0 : infotext.hashCode());
		return result;
		
	}
}
