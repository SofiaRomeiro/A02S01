package pencilCase;

import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

import pencilCase.Pencil;
import pencilCase.PencilComparator;

public class Case {

	private int _capacity;
	private LinkedList<Pencil> _pencils;

	public Case(int capacity) {
		_capacity = capacity;
		_pencils = new LinkedList<>();
	}


	public void addPencil(Pencil p) {
		_pencils.add(p);
	}


	public ArrayList<Pencil> getAllEqualPencils(Pencil pencil) {

		ArrayList<Pencil> pencils = new ArrayList<>();

		for (Pencil p : _pencils) {
			if (pencil.equals(p)) {
				pencils.add(p);
			}
		}

		return pencils;
	}


	public void removePencil(Pencil pencil) {

		Iterator<Pencil> iter = _pencils.iterator();

		while (iter.hasNext()) {
			Pencil p = iter.next();
			if (pencil.equals(p)) {
				iter.remove();
			}
		}
	}


	public void removePencilsWithColor(String color) {

		Iterator<Pencil> iter = _pencils.iterator();

		while (iter.hasNext()) {
			Pencil p = iter.next();
			if (p.getColor() == color) {
				iter.remove();
			}
		}
	}


	public LinkedList<Pencil> getPencilsByOrder() {

		LinkedList<Pencil> byOrder = new LinkedList<>();

		for (Pencil p : _pencils) {
			byOrder.add(p);
		}	

		Collections.sort(byOrder, new PencilComparator());

		return byOrder;
	}


	public LinkedList<Pencil> getAllPencils() {
		return _pencils;
	}

	public void showPencils() {

		LinkedList<Pencil> pcls = getAllPencils();
		for (Pencil p : pcls) {
			System.out.println(p.toString());
		}
	}


	public static void main(String[] args) {

		Case pcase = new Case(10);

		pcase.addPencil(new Pencil("bic", "blue"));
		pcase.addPencil(new Pencil("bic", "red"));
		pcase.addPencil(new Pencil("bic", "blue"));
		pcase.addPencil(new Pencil("star", "green"));
		pcase.addPencil(new Pencil("star", "red"));

		LinkedList<Pencil> tmp = pcase.getPencilsByOrder();
		pcase.showPencils();

		System.out.println("\nBy order:\n");

		for (Pencil p : tmp) System.out.println(p.toString());

		System.out.println("\nAfter remove:\n");

		pcase.removePencil(new Pencil("bic", "red"));
		pcase.showPencils();
		pcase.addPencil(new Pencil("bic", "red"));

		System.out.println("\nAfter remove:\n");

		pcase.removePencilsWithColor("blue");
		pcase.showPencils();





	}




}