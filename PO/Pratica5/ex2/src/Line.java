package src;

import src.*;

public class Line extends Shape {

	private Point _end;

	public Line(int initX, int initY, int endingX, int endingY) {
		super(initX, initY);
		_end = new Point(endingX, endingY);

	}

	public String getEndPoint() {
		return String.valueOf(_end.getX()) + " ," + String.valueOf(_end.getY());
	}

	@Override
	public void move(int x, int y) {
		super.setOrigin(x, y);
		_end.setPoint(x, y);
	}

	@Override
	public String draw() {
		return String.valueOf(super.getId()) + " Line [" + "(" + getOrigin() + ")" + " (" + getEndPoint() + ")]";
	}		

}
	