package edu.hm.cs.swe2.GeometricFigure;

public class Main {

	public static void main(String[] args) {

		GeometricFigure[] figures = new GeometricFigure[] {
				new Trieangle(5, 7, 4), new Circle(4, 2),
				new Recktangle(3, 10, 4), new Trieangle(2, 6, 3),
				new Recktangle(1, 5, 5), new Circle(0, 4),

				
				
				
				
		};
		figures.toString();
		System.out.println(figures.toString());
		System.out.println();
		
		System.out.println(figures);
			
		}

	public Object clone() throws CloneNotSupportedException {

		Circle tmp = (Circle) super.clone();

		return tmp;
	}
			
		}

	
