
public abstract class Funcionario {
	//utiliza-se o abstrato para informar que n�o existe nenhum objeto funcion�rio
	// mas sim ele serve de base para a constru��o do outros objetos
	//Sendo assim as classes de funcion�rios deve ser criadas nelas proprias
	
	private String nome;
	private String cpf;
	private double salario;
	
	// O metodo tamb�m pode ser abstrato e cada classe deve implementar o seu
	//metodo personalisado
	public abstract double getBonificacao();		
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
