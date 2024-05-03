
public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		
	}

	@Override
	public void imprimirInforComuns() {
		System.out.println("****Conta Poupança****");
		super.imprimirInforComuns();
	}
	

}
