public class Caneta {

	int quantidade; 	// valor por omissao para int, double, float... é 0
	String marca;		// valor por omissao é null
	boolean tapada; 	// valor por omissao = false
	static int numeroCanetas;	//atributo estatico {static} -> partilhado por todas as instancias da classe (acesso ao mesmo sitio da memoria)

	//todos os metodos declarados dentro da classe têm acesso aos seus atributos

	public void tapar() {
		tapada = true;
	}

	public void destapar() {
		tapada = false;
	}

	public String obtemMarca() {
		return marca;
	}

	public boolean escreve(String str) {
		if (str.length() > quantidade) 
			return false;
		
		quantidade -= str.length();
		// System.out.printf("%s\n", str); -> possivel para matar saudades de C <3
		System.out.println(str);
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

	public static void main(String[] args) {	//String[] <=> char **
		Caneta c1 = new Caneta(70, "Marca 2", false);
		Caneta c2 = new Caneta(80, "Marca 1", true);
		Caneta c3 = new Caneta(70, "Marca 50", true)

		c2.quantidade = 80;
		
		//c1.init(70, "Marca 2", false);	//inicializacao correta, no caso da criacao do metodo init()

		// OU (com duplicacao de codigo, ma pratica)

		//c1.quantidade = 70
		//c1.marca = "Marca 2";		// alternativa: c1.marca = new String("Marca 2") 
		//c1.tapada = false;

		System.out.println(c1.obtemMarca());

	}

}