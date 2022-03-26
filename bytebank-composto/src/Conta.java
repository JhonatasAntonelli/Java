public class Conta {
	private double saldo = 0;
	//principio do encapsulamento
	//Quando um atributo � privado ele n�o pode ser modificado
	//e nem lido por ninguem, a n�o ser pela pr�pria classe,
	// mas classes que est�o chamando o atributo n�o podem.
	int agencia = 42;
	int numero;
	Cliente titular;

	public void deposita(double valor) {

		this.saldo += valor;
//quando eu quero um retorno numerico usa-se ele no public void
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
//quando eu quero um retorno boolean usa-se ele no public boolean
			
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	

}
