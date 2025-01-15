package cachorro;

public class Cachorro {

	private String nome;
	private String raca;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void latir() {
		System.out.println(this.nome + " latiu");
	}

	public void dormir() {
		System.out.println(this.nome + " dormiu");
	}

	@Override
	public String toString() {
		return "Cachorro [nome=" + nome + ", raca=" + raca + ", idade=" + idade + "]";
	}
	
	
}

