package ggc;

public class NumberWithMemory extends Number {

	private int _previousNumber;

	public NumberWithMemory(int number) {
		super(number);
		_previousNumber = number;
	}

	public void undo() {

		int temporary = super.getNumber();
		super.setNumber(_previousNumber);
		_previousNumber = temporary;

	}

	public void doubleUndo() {
			undo();
	}

	public int getPreviousValue() {

		if (_previousNumber == super.getNumber()) {
			return super.getNumber();
		}
		else {
			return _previousNumber;
		}

	}
}