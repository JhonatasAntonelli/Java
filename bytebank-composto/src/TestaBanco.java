
public class TestaBanco {

	public static void main(String[] args) {
		Cliente Paulo = new Cliente();
		Paulo.nome = "Paulo Silveira";
		Paulo.cpf = "222.222.222-22";
		Paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		//associa o cliente Paulo a conta contaDoPaulo
		contaDoPaulo.titular = Paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
		System.out.println(Paulo);
	}
}
