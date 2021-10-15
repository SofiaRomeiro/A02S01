package estacao;

/**
 * Representa um veículo.
 **/

public class Veiculo {
  private String _marca;
  private Estacao _estacao;

  public Veiculo(String m) {
    _marca = m;
  }

  public void acelera() {
    System.out.println("VRUM VRUM");
  }

  public void trava() {
    System.out.println("GRRR GRRR");
  }

  public void buzina() {
    System.out.println("PII PII");
  }
  
  public String obtemMarca() {
    return _marca;
  }

  public void colocaEstacao(Estacao est) {
    _estacao = est;
  }

  public void abastece(int quantidade, int bomba) {
    int consumido = _estacao.abastece(quantidade, bomba);
    System.out.println("Abastecido: " + consumido);
  }
}
