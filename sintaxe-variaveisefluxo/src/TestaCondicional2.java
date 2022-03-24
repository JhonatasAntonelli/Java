
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 19;		
		int quantidadedepessoas = 3;
		boolean acompanhado = quantidadedepessoas >=2;
		System.out.println("O valor de acompanhado é " + acompanhado);
		if (idade >= 18 && acompanhado) {
			// a utilização das || é igual ao or
			// a utilização do && é igual ao and
			System.out.println("Seja bem vindo");
		} else {			
			System.out.println("É uma pena, você não pode entrar");
			}
		
		}
	}


