
public class TestaValores {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 24226);
		
		//O parenteses � um construtor, sendo assim podemos 
		//adicionar alguns atributos iniciai, j� que o 
		//construtor � invocado apenas uma vez. ex:
		//� poss�vel colocar if no construtor
		//Nesse caso podemos retirar os set e get
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(12548984);
		
		Conta conta2 = new Conta(1337, 24249);
		Conta conta3 = new Conta(1325, 24899);
		
		System.out.println(Conta.getTotal());
	}

}
