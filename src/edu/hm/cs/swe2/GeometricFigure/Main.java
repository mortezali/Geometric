package edu.hm.cs.swe2.GeometricFigure;

public class Main {

	public static void main(String[] args) {
		
		Trieangle dreieck1 = new Trieangle(5, 7, 4);
		Circle kreis1 = new Circle(4, 2);
		Recktangle viereck1 = new Recktangle(3, 10, 4);
		
		Trieangle dreieck2 = new Trieangle(2, 6, 3);
		Recktangle viereck2 = new Recktangle(1, 5, 5);
		Circle kreis2 = new Circle(0, 4);
	
		
		
		GeometricFigure[] figures = new GeometricFigure[] {
				dreieck1, kreis1, viereck1, dreieck2, viereck2, kreis2,  
		};
		GeometricFigure[] cloneFigure = new GeometricFigure []{
				new Trieangle (dreieck1), new Circle (kreis2), new Recktangle (viereck1), new Trieangle (dreieck2),
				new Recktangle (viereck2), new Circle (kreis2),
		};
		
	
		for ( int i = 0; i < figures.length; i++){
			
			
			figures[i].printFigureInformation();
			
		}
		
//		for(int i = 0; i < figures.length; i++){
//			System.out.println("Vergleich identität:");
//			System.out.println(figures[i] == cloneFigure[i]);
//			System.out.println("Vergleich inhalt: ");
//			System.out.println( figures[i].equals(cloneFigure[i]));
//		}
//		

			
		}
}
	
