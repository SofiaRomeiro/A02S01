package estacao;

/**
 * Esta classe representa uma estação de serviço com 10 bombas de combustível.
 **/

public class Estacao {

  private int _quantidadeCombustivel;
  private final int _capacidade;

  //private int[]_consumido;

  private int _consumido[];


  private final int NUMERO_BOMBAS = 10;

  public Estacao(int capacidade) {
    _capacidade = capacidade;
    _consumido = new int[NUMERO_BOMBAS];
    _quantidadeCombustivel = capacidade;
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

    Estacao mystation = new Estacao(1000);

    mystation.abastece(20, 2);

    System.out.println("2 : " + mystation.obtemAbastecidoBomba(2));
    System.out.println("1 : " + mystation.obtemAbastecidoBomba(1));
  }
}
    
