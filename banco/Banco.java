package banco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	private String nome;
	private List<Conta> contas;

	public Banco(String nome){
		this.setNome(nome);
		this.setContas(new ArrayList<>());
	}

	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	private void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void addConta(Conta conta){
		this.contas.add(conta);
//		System.out.println("Conta adicionada: "+ conta.numero );
	}

	public void listContas(){
		System.out.println("--- Lista de contas no banco "+ this.getNome() + " ---");
		Iterator<Conta> contasAsIterator = this.contas.iterator();
		while (contasAsIterator.hasNext()){
			Conta conta = contasAsIterator.next();
			System.out.println("Cliente:" + conta.cliente.getNome());
			System.out.println("Agencia: " + conta.getAgencia() + " | Conta:" + conta.getNumero());
			System.out.println("---");
		}
	}
}
