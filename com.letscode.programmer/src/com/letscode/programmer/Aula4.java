package com.letscode.programmer;

public class Aula4 {
	public static void main(String[] args) {

		boolean autentico = true;
		if (autentico) {
			System.out.println("Usu�rio incorreto");
		} else {
			System.out.println("Usu�rio incorreto");

		}
		int numero = 10;
		
		switch (numero) {//� uma maneira de tratamento de erros
		case 10://pode ser feito com String
			System.out.println("Numero 10");
			break;
		case 11:
			System.out.println("numero 11");
			break;
		default:
			System.out.println("Numero desconhecido");
			
		}
		String nome = 56;//pode ser usado inclusive um enum		
				
		switch (nome.toLowerCase()) {//� uma maneira de tratamento de erros
		case "ana"://pode ser feito com String
			System.out.println("Numero 10");//exemplo; quando um atendente eletr�nico solicita para voc� digitar o numero de op��es
			break;//se n�o colocar o break ele entra e executa tudo abaixo da linha que foi lida
		case "Maria":
			System.out.println("numero 11");
			break;
		default:
			System.out.println("Numero desconhecido");
		}
	}
}
