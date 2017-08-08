package classes;
/**
 * Esta classe serve de base para todos os itens que serao cadastrados no sistema.
 * Projeto Lp2 - Tracking Things
 * @author Italo Modesto.
 */
public class Item {
	protected String nome;
	protected double valor;
	protected boolean estado;
	
	public Item(String nome, double valor, boolean estado){
		this.nome = nome;
		this.valor = valor;
		this.estado = false;
	}
	/**
	 * 
	 * @return o nome do item.
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Este metodo altera o nome do item.
	 * @param nome sera o novo nome do item.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * 
	 * @return o valor do item.
	 */
	public double getValor() {
		return valor;
	}
	/**
	 * Este metodo altera o valor do item.
	 * @param valor sera o novo valor do item.
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	/**
	 * 
	 * @return o estado do item.
	 */
	public boolean getEstado() {
		return estado;
	}
	/**
	 * Este metodo altera o estado do item.
	 * @param estado sera o novo estado do item.
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
