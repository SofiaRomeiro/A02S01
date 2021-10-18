package src;

import src.*;


public abstract class Shape {
	private int _id;
	private Point _origin;
	private Editor _editor;
	private static int _idCounter = 0;

	public Shape(int x, int y) {
		_id = _idCounter;
		increaseId();
		_origin = new Point(x, y);
		_editor = new Editor();
	}

	public abstract void move(int x, int y);

	public abstract String draw();

	public void increaseId() {
		_idCounter++;
	}

	public void setOrigin(int x, int y) {
		_origin.setPoint(x, y);
	}

	public String getOrigin() {
		String point = String.valueOf(_origin.getX()) + ", " + String.valueOf(_origin.getY());
		return point;
	}

	public int getId() {
		return _id;
	}


}