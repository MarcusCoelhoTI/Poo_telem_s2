package banco;

public class Conta {
	private String cliente;
	private Correntista correntista;
	private int conta;
	private double saldo;
	
	public Conta() {
		
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Correntista getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	protected void sacar(double valor) {
		this.saldo -= valor;
	}
	
	protected void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public String toString() {
		return "Conta [cliente=" + cliente + ", correntista=" + correntista + ", conta=" + conta + ", saldo=" + saldo
				+ "]";
	}
	
	
	
	

}
