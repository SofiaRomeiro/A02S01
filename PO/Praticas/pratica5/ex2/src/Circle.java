package src;

import src.*;

public class Circle extends Shape {

	private double _radius;

	public Circle(int x, int y, double radius) {
		super(x,y);
		_radius = radius;
	}

	public double getRadius() {
		return _radius;
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
		return String.valueOf(super.getId()) + " Circle [" + "(" + getOrigin() + ") " + _radius + "]";
	}


}