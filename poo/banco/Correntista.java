//@Author Marcus Coelho
package banco;

public class Correntista{
	
	private String nome;
	private String cpf;
	
	public Correntista(){
		
	}

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
	

	@Override
	public String toString() {
		return "Correntista [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	

}
