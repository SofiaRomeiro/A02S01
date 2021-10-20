package ex.app.edit;

import ex.core.IntegerManager;
import pt.tecnico.uilib.menus.Command;

public class RemoveNumber extends Command<IntegerManager> {

	public RemoveNumber(IntegerManager ent) {
		super("Remover número", ent);
		addIntegerField("number", "Introduza um número: ");
	}

	protected void execute() {
		Integer number = integerField("number");
		String message;

		if (_receiver.removeNumber(number))
			message = "Número removido " + number;
		else
			message = "Numero não removido";

		_display.popup(message);
	}




}