package carro;

public class Carro {

	private String placa;
	private String cor;
	private String marca;
	private int velocidade;

	Carro(String placa, String cor, String marca, int velocidade) {
		this.placa = placa;
		this.cor = cor;
		this.marca = marca;
		this.velocidade = velocidade;
	}

	Carro() {

	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public void acelerar() {
		this.velocidade = this.velocidade + 5;
	}

	public void frear() {
		this.velocidade = this.velocidade - 5;
	}

	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", cor=" + cor + ", marca=" + marca + ", velocidade=" + velocidade + "]";
	}

}
