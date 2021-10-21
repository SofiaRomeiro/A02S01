package ex.app.main;

import ex.core.IntegerManager;
import pt.tecnico.uilib.menus.Command;


import java.util.List;
import java.util.ArrayList;


public class ShowAllNumbers extends Command<IntegerManager> {

	public ShowAllNumbers(IntegerManager entity) {
		super("Mostrar todos os numeros e respetiva media", entity);
	}

	protected void execute() {

		List<Integer> numbers = _receiver.getNumbers();
		String message;
		Integer mean = 0;

		if (numbers.size() == 0 ) {

			message = "Sem numeros para mostrar!";
		}

		else {		

			for (Integer number : numbers) {
				_display.addLine(number.toString());
				mean += number;
			}

			mean /= numbers.size();
			message = "Mean = " + mean;

			_display.display();
		}

		_display.popup(message);

	}

}