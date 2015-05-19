package edu.hm.cs.swe2.GeometricFigure;

public class Main {

	public static void main(String[] args) {

		GeometricFigure[] figures = new GeometricFigure[] {
				new Trieangle(5, 7, 4), new Circle(4, 2),
				new Recktangle(3, 10, 4, false), new Trieangle(2, 6, 3),
				new Recktangle(1, 5, 5, true), new Circle(0, 4),

		};
		System.out.println(figures);

	}
}