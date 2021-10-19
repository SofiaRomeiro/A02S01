package pencilCase;

public class Pencil {

	private String _brand;
	private String _color;

	public Pencil(String brand, String color) {
		_brand = brand;
		_color = color;
	}

	public boolean equals(Pencil p) {
		return (_brand.compareTo(p._brand) == 0) && (_color.compareTo(p._color) == 0);
	}

	public String getColor() {
		return _color;
	}

	public String getBrand() {
		return _brand;
	}

	public String toString() {
		return String.format("%s, %s", _brand, _color);
	}

}