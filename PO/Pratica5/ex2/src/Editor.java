package src;

import src.*;

public class Editor {


	public static void main(String[] args) {

		Circle myCircle = new Circle(1, 2, 0.5);
		System.out.println(myCircle.draw());
		myCircle.move(3, 4);
		System.out.println(myCircle.draw());

		System.out.println("\n");

		Line myLine = new Line(0, 0, 1, 1);
		System.out.println(myLine.draw());
		myLine.move(2,2);
		System.out.println(myLine.draw());

		System.out.println("\n");

		Square mySquare = new Square(5, 5, 25);
		System.out.println(mySquare.draw());
		mySquare.move(1,5);
		System.out.println(mySquare.draw());

	}

}