package classes;
/**
 * Esta classe serve de base para todos os itens que serao cadastrados no sistema.
 * @author Italo Modesto.
 *
 */
public abstract class Item {
	protected String nome;
	protected Double valor;
	protected boolean estado;
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
	public Double getValor() {
		return valor;
	}
	/**
	 * Este metodo altera o valor do item.
	 * @param valor sera o novo valor do item.
	 */
	public void setValor(Double valor) {
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
