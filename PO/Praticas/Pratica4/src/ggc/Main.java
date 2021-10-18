package ggc;


public class Main {

	public static void main(String[] args) {

		NumberWithMemory nWM = new NumberWithMemory(5);

		System.out.println("Inserted : " + nWM.getNumber());

		nWM.setNumber(10);

		System.out.println("Changed: " + nWM.getNumber());


		nWM.undo();

		System.out.println("Undo : " + nWM.getNumber());

		nWM.doubleUndo();

		System.out.println("Double undo : " + nWM.getNumber());

		System.out.println("Previous value : " + nWM.getPreviousValue());

	}

}