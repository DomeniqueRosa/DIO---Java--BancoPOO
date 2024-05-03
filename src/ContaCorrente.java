
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirInforComuns() {
		System.out.println("****Conta Corrente****");
		super.imprimirInforComuns();
	}

}
