
public class ContaCorrente extends Conta {
	//com o extend a classe herda os metodos e atributos, mas nunca os construtores,
	//pois cada construtor pertence a sua propria classe
	//temos que criar  nosso construtor
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		//fazendo isso esse construtor vai usar o construtor especifico, pois possuem os mesmo parametros
				
	}

	@Override
	public boolean saca (double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

}
