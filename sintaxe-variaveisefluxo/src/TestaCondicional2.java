
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 19;		
		int quantidadedepessoas = 3;
		boolean acompanhado = quantidadedepessoas >=2;
		System.out.println("O valor de acompanhado � " + acompanhado);
		if (idade >= 18 && acompanhado) {
			// a utiliza��o das || � igual ao or
			// a utiliza��o do && � igual ao and
			System.out.println("Seja bem vindo");
		} else {			
			System.out.println("� uma pena, voc� n�o pode entrar");
			}
		
		}
	}


