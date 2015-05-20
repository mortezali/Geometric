package edu.hm.cs.swe2.GeometricFigure;

public class Main {

	public static void main(String[] args) {

		GeometricFigure[] figures = new GeometricFigure[] {
				new Trieangle(5, null, 7, 4), new Circle(4, null, 2),
				new Recktangle(3, null, 10, 4), new Trieangle(2, null, 6, 3),
				new Recktangle(1, null, 5, 5), new Circle(0, null, 4),

		};
		figures.toString();
		System.out.println(figures.toString());
		System.out.println();
		
		System.out.println(figures);
			
		}
		

	}
