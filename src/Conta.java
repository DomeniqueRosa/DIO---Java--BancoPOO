import java.util.Objects;

public abstract class Conta {
	private static final int  AGENCIA = 001;
	private static int SEQUENCIAL = 1;
	
	private double saldo;
	private int numeroConta;
	private int agencia;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public void sacar(double valor) {
		if(valor <= saldo) {
			this.saldo = saldo - valor;
		}
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			this.saldo = saldo + valor;
		}
	}
	
	public void transferir(Conta destino, double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			destino.depositar(valor);
		}
	}
	
	public void imprimirInforComuns() {
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Conta: " + this.numeroConta);
		System.out.println("Agencia: " + this.agencia);
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(agencia, numeroConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return agencia == other.agencia && numeroConta == other.numeroConta;
	}

	@Override
	public String toString() {
		return String.format("Conta: %-5d Cliente: %-10s Tipo: %-10s", numeroConta,cliente, getClass().getName());
	}
	
}
