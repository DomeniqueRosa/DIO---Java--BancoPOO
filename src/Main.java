
public class Main {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Joao");
		Cliente c2 = new Cliente("Ana");
		Banco banco = new Banco("Brazil");
		Conta cc = new ContaCorrente(c1);
		Conta cp = new ContaPoupanca(c2);
		
		cc.imprimirInforComuns();
		cp.imprimirInforComuns();
		banco.adicionarConta(cp);
		banco.adicionarConta(cc);
		
		banco.listarContas();
	}

}
