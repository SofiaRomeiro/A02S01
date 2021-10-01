
// conversoes automaticas do java para permitir operacoes

int i = 5;
Integer i2 = new Integer(5) 	//criacao de objeto, causa custos no tempo de execucao
Integer i3 = i2 + 5; 			//unboxing


//Strings

String a = "abc";
String a2 = "def";

a = a + a2; // a = "abcdef"

//A variável "a" passa a ser a referencia para a string concatenada

//System.out.println("....." + <variable>); sendo que a variavel nao tem de ser obrigatoriamente do tipo String (o Java converte o tipo dado em String)

