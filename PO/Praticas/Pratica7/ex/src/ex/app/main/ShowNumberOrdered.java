package ex.app.main;

import pt.tecnico.uilib.menus.Command;

import java.util.*;

import ex.core.IntegerManager;

public class ShowNumberOrdered extends Command<IntegerManager>{

	public ShowNumberOrdered(IntegerManager entity) {
		super("Mostrar os numeros ordenados", entity);
	}

	protected void execute() {

		List<Integer> list = _receiver.getNumbers();
		List<Integer> ordered = new ArrayList<>(list);

		Collections.sort(ordered, new NumberComparator());

		for (Integer i : ordered) {
			_display.addLine(i.toString());			
		}

		_display.display();

	}
}


class NumberComparator implements Comparator<Integer> {

	public int compare(Integer i1, Integer i2) {
		return i1 - i2;
	}
}