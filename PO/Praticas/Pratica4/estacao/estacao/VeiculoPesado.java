package estacao;

public class VeiculoPesado extends Veiculo {

  private int _aceleracoes;
  private int _travagens;

  public VeiculoPesado(String marca) {
    super(marca);
  }

  public void buzina() {
    System.out.println("POO POO");
  }

  public int obtemNumeroAceleracoes() {
    return _aceleracoes;
  }

  public int obtemNumeroTravagens() {
    return _travagens;
  }

  public void trava() {
    super.trava();
    _travagens++;
  }

  public void acelera() {
    super.acelera();
    _aceleracoes++;
  }
}
  
