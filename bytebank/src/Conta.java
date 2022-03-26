public class Conta {
	double saldo;
	int agencia = 42;
	int numero;
	String titular;

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

}
