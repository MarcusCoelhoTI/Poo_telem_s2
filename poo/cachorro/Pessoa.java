//@Author Marcus Coelho
package cachorro;

public class Pessoa {
	private String nome;
	private String cpf;
	private Cachorro pet;

	Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
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

	public Cachorro getPet() {
		return pet;
	}

	public void setPet(Cachorro pet) {
		this.pet = pet;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + "]";
	}

}
