package ex.app.edit;

import ex.core.IntegerManager;

import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.forms.Form;



public class ReplaceNumber extends Command<IntegerManager> {

	public ReplaceNumber(IntegerManager entity) {
		super("Substituir numero numa dada posicao", entity);
		addIntegerField("index", "Escolha a posicao: ");
		addIntegerField("number", "Insira o novo numero: ");
	}

	protected void execute() {

		Integer index = integerField("index");
		Integer number = integerField("number");
		String message = "Numero substituido!";

		_receiver.replaceNumber(index, number);

		_display.popup(message);

	}

}