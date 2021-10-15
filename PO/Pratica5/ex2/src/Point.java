package src;

import src.*;

public class Point {

	private int _x;
	private int _y;

	public Point(int x, int y) {
		_x = x;
		_y = y;
	}

	public int getX() {
		return _x;
	}

	public int getY() {
		return _y;
	}

	public void setPoint(int x, int y) {
		_x += x;
		_y += y;
	}


}