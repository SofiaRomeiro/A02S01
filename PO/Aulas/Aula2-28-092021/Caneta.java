public class Caneta {

	private int _quantidade; 	// valor por omissao para int, double, float... é 0
	private String _marca;		// valor por omissao é null
	private boolean _tapada; 	// valor por omissao = false

	private static int _numeroCanetas = 56;	//atributo estatico {static} -> partilhado por todas as instancias da classe (acesso ao mesmo sitio da memoria)

	//todos os metodos declarados dentro da classe têm acesso aos seus atributos

	public void tapar() {
		_tapada = true;
	}

	public void destapar() {
		_tapada = false;
	}

	public String obtemMarca() {
		return _marca;
	}

	public boolean encher(int q) {
		if (q <= 0 ) 
			return false;
		_quantidade += q;
		return true;
	}

	public boolean escreve(String str) {
		if (str.length() > _quantidade) 
			return false;
		
		_quantidade -= str.length();
		// System.out.printf("%s\n", str); -> possivel para matar saudades de C <3
		System.out.println(str);
	}

	public boolean equals(Caneta c) {
		return quantidade == c.quantidade && marca.equals(c.marca) && tapada == c.tapada;		
	}

	public Caneta canetaComMaiorQuantidade(Caneta c) { //a caneta c vai ser comparada com a quantidade de tinta sobre a qual o método foi invocado
		if (c.quantidade > quantidade)
			return c;
		return this;
	} 

	// {public Caneta} o Construtor não devolve nada, mas não é void. Ao colocar void, deixa de ser construtor (metodo especial das classes)
	// Java adiciona construtor por omissao (que inicializa tudo com os valores default) quando o programador nao declara um construtor
	// cada atributo é PRIVADO para cada objeto

	public Caneta(int q, String m, boolean b) {		//metodo de inicializacao dos atributos do objeto, construtor (obriga a ser usado)
		quantidade = q;
		marca = m;
		tapada = b;
		numeroCanetas++;
	}

	public Caneta(int q, String m) {				//permite fazer poupança de codigo, mesma função que as linhas acima, apenas com argumentos diferentes
}		
		this(q, m , true); 					

	public static void main(String[] args) {	//String[] <=> char **
		Caneta c1 = new Caneta(70, "Marca 2", false);
		Caneta c2 = new Caneta(80, "Marca 1", true);
		Caneta c3 = new Caneta(70, "Marca 50", true);

		c2._quantidade = 80;

		String strObj2 = new String("abc"); //	ambas estas formas sao equivalentes, 
											//	na segunda é criada uma instancia e atribuido o valor "abc", automaticamente
		String strObj1 = "abc";

		int[] array = new int[40];

		int total = 0; //a inicialização de uma variavel local é obrigatoria, ao contrário de em C
		for (int i=0; i < array.length; i++)
			total += array[i];

		// outro tipo de for : for-each

		for (int elemento : array) { 	// por cada elemento presente no array
			total += element;
		}
		
		//c1.init(70, "Marca 2", false);	//inicializacao correta, no caso da criacao do metodo init()

		// OU (com duplicacao de codigo, ma pratica)

		//c1.quantidade = 70
		//c1.marca = "Marca 2";		// alternativa: c1.marca = new String("Marca 2") 
		//c1.tapada = false;

		System.out.println(c1.obtemMarca());

	}

}