
//PERGUNTAS:

/* 
	1- Podemos criar um método unicamente para ser chamado dentro de outro método 
(redução de codigo) ou há outra forma melhor?

	2- O que acontece no construtor para que seja feito desta forma? Qual o 
   processo por trás?
 */


public class Pneu {

	private int _airPressure;
	private static int _recommendedAirPressure;
	private boolean _flatTier;


	public int getAirPressure() {
		return _airPressure;
	}

	public int getRecommendedAirPressure() {
		return _recommendedAirPressure;
	}

	public boolean isEmpty() {
		return _airPressure < (0.8*_recommendedAirPressure);
	}

	public void changeAirPressure(int airPressure) {

		if (airPressure > (1.5*_recommendedAirPressure)) {
			_flatTier = true;
			_airPressure = 0;
		}

		else if (_flatTier) {
			return;
		}

		else {
			_airPressure = airPressure;
		}

	}

	public boolean isFlatTire() {
		return _flatTier;
	}

	public Pneu(int ap, int rap, boolean ft) {
		_airPressure = ap;
		_recommendedAirPressure = rap;
		_flatTier = ft;
	}

	public Pneu(int ap, int rap) {
		this(ap, rap, false);
	}


	public static void main(String[] args) {

		Pneu pTest = new Pneu(70, 95);

		pTest.changeAirPressure(200);

		System.out.println("Result  :  "+(pTest.isEmpty()));


	}


}