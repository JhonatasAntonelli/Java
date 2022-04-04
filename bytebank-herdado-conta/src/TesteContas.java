
public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(112, 112);
		cp.deposita(200);
		
		cc.transfere(10, cp); 
		System.out.println("Saldo C/C " +cc.getSaldo());
		System.out.println("Saldo C/P " +cp.getSaldo());
	}

}
