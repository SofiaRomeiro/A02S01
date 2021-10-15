public class A {

	public static final int MAXIMO = 10; //para ser static tem de se definir um valor de inicialização
	public static final Caneta CANETA = new Caneta(10); // é uma constante, referencia sempre o mesmo obejto, mas permite alterar o estado do objeto 
	public final int _xpto; //non static variable

	public A (int i) { //construtor 
		_xpto = i;
	}
}

