package estacao;

public static ServiceStation {


/**
 * Esta classe representa uma estação de serviço com 10 bombas de combustível.
 **/


	private int _quantidadeCombustivel;
	private final int _capacidade;
	private int[] _consumido;
	private final int NUMERO_BOMBAS = 10;

	public Estacao(int capacidade) {
	_capacidade = capacidade;
	_consumido = new int[NUMERO_BOMBAS];
	}

	public int abastece(int quantidade, int bomba) {
	if (quantidade > _quantidadeCombustivel)
	  quantidade = _quantidadeCombustivel;

	_quantidadeCombustivel -= quantidade;
	_consumido[bomba] += quantidade;

	return quantidade;
	}

	public int obtemQuantidadeCombustivel() {
	return _quantidadeCombustivel;
	}

	public int obtemAbastecidoBomba(int bomba) {
	return _consumido[bomba];
	}

	public void adicionaCombustivel(int quantidade) {
	_quantidadeCombustivel += quantidade;
	}

	public static void main(String[] args) {

		ServiceStation serviceStation = new ServiceStation(1600);
		private int _litrosPorBomba[] = new int[10];

		private int quantity;
		private int capacity;

		private static final NUMERO_VEICULOS = 10;

		Vehicle vehicles[] = new Vehicle[NUMERO_VEICULOS];

		for (int i = 0; i < 5; i++) {
			vehicles[i] = new Vehicle("XPTO" + i, serviceStation);

			System.out.println(vehicles[i].obtemMarca());
			System.out.println(vehicles[i].buzina());
			System.out.println(vehicles[i].abastece(150, 2));
			System.out.println(vehicles[i].breakCar());
			System.out.println(vehicles[i].speedup());

		} 

		for (int i = 5; i < 10; i++) {
			vehicles[i] = new HeavyVehicle("XPTO" + i, serviceStation);

			System.out.println(vehicles[i].obtemMarca());
			System.out.println(vehicles[i].buzina());
			System.out.println(vehicles[i].abastece(150, 2));
			System.out.println(vehicles[i].breakCar());
			System.out.println(vehicles[i].speedup());
		} 

		/* OUTRA SOLUCAO 
	
		for (int i = 0; i < 10 ; i++) {
			
			if (i < s) { vehicles[i] = new Veiculo("XPTO" + i, serviceStation);}
			else {vehicles[i] = new VeiculoPesado("XPTO" + i, serviceStation);}

		}


		for (Vehicle veiculo : vehicles) {
			System.out.println(vehicles[i].obtemMarca());
			System.out.println(vehicles[i].buzina());
			System.out.println(vehicles[i].abastece(150, 2));
			System.out.println(vehicles[i].trava());
			System.out.println(vehicles[i].acelera());
		}






		*/





	}




}