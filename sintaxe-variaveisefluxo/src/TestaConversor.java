
public class TestaConversor {

	public static void main(String[] args) {
		double salario = 1250.50;
		int valor = (int) salario;
		System.out.println(valor);
		//O n�mero flutuante usa o double e inteiros cabem no duble,
		//mas duble n�o cabem no flutuante.
		//Em uma divis�o de int que resulte em futuante
		// O java imprime apenas o n�mero sem a virgula
		// Quando � um n�mero muito grande � necess�rio utilizar igual esta abaixo
		// com o l no final do n�mero
		//para n�meros muito pequenos pode ser utilizado o short vai at� 2113
		//Menor ainda � o byte que vai at�o 127
		long numeroGrande = 356897465653315l;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		
		//para um ponto flutuante tamb�m pode ser utilizado o float
		//por�m para isso � necess�rio colocar o f no final do n�mero
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
		
		
		
				
	}
	
}
