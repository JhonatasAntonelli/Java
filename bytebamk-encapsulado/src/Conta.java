public class Conta {
	private double saldo = 0;
	// principio do encapsulamento
	// Quando um atributo � privado ele n�o pode ser modificado
	// e nem lido por ninguem, a n�o ser pela pr�pria classe,
	// mas classes que est�o chamando o atributo n�o podem.
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	//isso faz com que o total seja apenas a essa classe
	//ele n�o pertence a nunhuma conta ou objeto
	
	//construtor abaixo
	public Conta(int agencia, int numero) {
		total++;
		System.out.println("O total de contas � "+ total);
		this.agencia = agencia;
		this.numero = numero;		
		System.out.println("Estou criando uma conta "+ this.numero);
				
	}

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

	public int getNumero() {
		return this.numero;

	}

	public void setNumero(int numero) {
		if (numero <=0) {
			System.out.println("N�o pode valor menor ou igual a zero");
			return;
		}
		this.numero = numero;

	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o pode valor menor ou igual a zero");
			return;
					}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;

	}

	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}
