package src;

import src.*;

public class Square extends Shape {

	private int _size;

	public Square(int x, int y, int size) {
		super(x,y);
		_size = size;
	}

	public int getSize() {
		return _size;
	}

	public String getOrigin() {
		return super.getOrigin();
	}

	@Override
	public void move(int x, int y) {
		super.setOrigin(x, y);
	}

	@Override
	public String draw() {
		return String.valueOf(super.getId()) + " Square [(" + getOrigin() + ") " + _size + "]";
	}

}