
public class TesteSacaNegaivo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);		
		System.out.println(conta.saca(200));
		System.out.println(conta.getSaldo());
		//como o atributo saldo ta como privado ele n�o pode ser lido diretamente,
		//� necess�rio fazer a leitura de modo indireto
		
		
		
	}

}
