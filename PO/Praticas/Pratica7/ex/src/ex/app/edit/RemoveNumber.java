package ex.app.edit;

import java.util.*;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.forms.Form;

import ex.core.IntegerManager;

public class RemoveNumber extends Command<IntegerManager> {

	public RemoveNumber(IntegerManager entity) {
		super("Remover numero", entity);
		addIntegerField("removeNumber", "Insira o numero que pretende remover: ");
	}

	protected void execute() {

		Integer number = integerField("removeNumber");
		String message;

		if (_receiver.removeNumber(number)) {
			message = "Numero " + number + " removido com sucesso!";
		}
		else {
			message = "Numero " + number + " nao removido!";
		}

		_display.popup(message);

	}
}