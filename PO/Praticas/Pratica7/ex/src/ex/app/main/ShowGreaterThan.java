package ex.app.main;

import java.util.List;

import ex.core.IntegerManager;

import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.forms.Form;


public class ShowGreaterThan extends Command<IntegerManager> {

	private Integer _lowerBound;

	//constructor

	public ShowGreaterThan(IntegerManager entity) {
		super("Apresentar numeros maiores do que um dado valor", entity);
		addIntegerField("lowerBound", "Insira o numero pretendido: ");		
	}

	protected void execute() {

		List<Integer> list;
		_lowerBound = integerField("lowerBound");

		//_form.parse();

		list = _receiver.getNumbers();
		
		for (Integer i : list) {
			if (i > _lowerBound)
				_display.addLine("" + i);
		}

		_display.display(); 
	}
}


