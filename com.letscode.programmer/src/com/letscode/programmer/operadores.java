package com.letscode.programmer;

import java.math.BigDecimal;

public class operadores {
	public static void main(String[] args) {
		double altura = 10 / 3;// mesmo declarando como double temos que colocar o valor.0
		double res = 10.0 / 3;
		long idade = 9;
		var nova = 5.5;// O var sempre sera do tipo iniciado 
		// nesse caso ser� double, na duvida usar essa s� nos retornos

		// converter variaveie n�o � poss�vel,
		// temos que criar uma nova vari�vel do
		// tipo que queremos com valor igual a variavel antiga
		double numero = idade + 1;
		//compara��o entre objetos deve ser feito com o equals
		
		System.out.println(altura == nova);
		System.out.println(altura);
		System.out.println(res);
		System.out.println(nova);
		
		System.out.println(1 == 1.0);
		System.out.println(1 != 1);
		System.out.println(1 < 1);
		System.out.println(1 > 1);
		System.out.println(1 <= 1);
		System.out.println(1 >= 1);
		
		String nome = "Jhonatas";
		System.out.println(nome.equals("jhonatas"));// faz compara��o de string
		
		int numeros = 5;
		System.out.println(numeros++);// isso faz primeiro imprimir o valor e depois somar
		System.out.println(numeros);
		
		System.out.println(++numeros);//nesse caso ele primeiro adiciona e depois imprimir
		
		System.out.println(numeros += 2);
		
		int i = 5;
		System.out.println(i ==5 ? 1 : 2);//if i ==5 print 1 else print 2
		// o uso do % 2 s� da resultado 0 para par e 1 para  impar
		// coso o divisor � diferente de 2 ele apresenta o resto da divis�o
		
		int r1 = 9 % 2;
		System.out.println(r1);
		
		int r2 = 19 % 5;
		System.out.println("esse" + r2);
		
		int x = 2;
		x = x > 2 ? x-- : x++;
		x = x > 2 ? x-- : x++;
		x = x > 2 ? x-- : x++;
		
		System.out.println(x);
		
		// formas de declarar um arrey
		// um arrey � um objeto e um objeto � uma classe
		boolean[] status;
		int[]ida;
		
		//BigDecimal � uma classe utilizada para calculos com muitos numeros depois da virgula
		
		/* kjahvlaehlhbtr
		 * 
		 */
		
		
				

	}

}
