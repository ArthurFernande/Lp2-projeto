package classes;
import java.util.HashSet;
import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String email;
	private String celular;
	
	private HashSet <Item> Itens = new HashSet();
	private ArrayList <Emprestimo> Emprestimos = new ArrayList();

	public Usuario(String nome, String email, String numero) {
		this.nome = nome;
		this.email = email;
		this.celular = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	/**
	 * Este metodo é responsavel por cadastrar itens no Sistema.
	 * @param nome 
	 * @param valor
	 * @param estado
	 */
	public void addItem(String nome, double valor) {
		Item novoItem = new Item(nome,valor);
		Itens.add(novoItem);
	}
	/**
	 * Este metodo é responsavel por remover itens do sistema.
	 * @param nome
	 * @param valor
	 * @param estado
	 */
	public void removerItem(String nome, float valor) {
		Item novoItem = new Item(nome,valor);
		for (Item itemremove : Itens){
			if (itemremove.toString() == novoItem.toString()){
				Itens.remove(itemremove);
			}
		}
	}
	
	public void pesquisarItem(String nomeItem) {

	}
	
	public void atualizarItem(String nome, float valor){
		
	}

	@Override
	public String toString() {
		return this.nome + " - " + this.email + " - " + this.celular;
	}

	// Falta HashCode e Equals

}
