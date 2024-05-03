import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> listaContas;
    private String nome;
    
	public Banco(String nome) {	
		this.listaContas = new ArrayList<Conta>();
		this.nome = nome;
	}
	
	public int adicionarConta(Conta c) {
		if(c != null) {
			listaContas.add(c);
			return 0;
		}else {
			return -1;
		}
    }
	
	public int removerConta(Conta c) {
		if(listaContas.contains(c)) {
			listaContas.remove(c);
			return 0;
		}else {
			
			return -1;
		}
	}
	
	public void listarContas() {
		System.out.println("************Lista das Contas do banco " + this.nome +"**************\n");
		for (Conta conta : listaContas) {
			System.out.println(conta);
		}
	}
}
