
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 17;
		int quantidadedepessoas = 3;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem vindo");			
		} else {
			if(quantidadedepessoas >= 2) {
				System.out.println("Voc� n�o tem 18 anos, mas pode entrar, "
						+ "pois est� acompanhado");				
			} else {			
			System.out.println("� uma pena, voc� n�o pode entrar");
			}
		}
	}

}
