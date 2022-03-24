
public class TestaConversor {

	public static void main(String[] args) {
		double salario = 1250.50;
		int valor = (int) salario;
		System.out.println(valor);
		//O número flutuante usa o double e inteiros cabem no duble,
		//mas duble não cabem no flutuante.
		//Em uma divisão de int que resulte em futuante
		// O java imprime apenas o número sem a virgula
		// Quando é um número muito grande é necessério utilizar igual esta abaixo
		// com o l no final do número
		//para números muito pequenos pode ser utilizado o short vai até 2113
		//Menor ainda é o byte que vai atéo 127
		long numeroGrande = 356897465653315l;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		
		//para um ponto flutuante também pode ser utilizado o float
		//porém para isso é necessário colocar o f no final do número
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
		
		
		
				
	}
	
}
