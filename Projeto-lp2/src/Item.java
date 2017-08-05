package projeto;

/**
 * Projeto Lp2 - Tracking Things
 * @author Enzo Raian
 */

public class Item {
	private String nome;
	private float valor;
	private String estado;
	
	public Item(String nome, float valor, String estado){
		this.nome = nome;
		this.valor = valor;
		this.estado = estado;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return this.valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String toString(){
		return this.nome + " - " + this.valor + " - " + this.estado;
	}
	
	// Falta Hashcode e Equals
	
}
