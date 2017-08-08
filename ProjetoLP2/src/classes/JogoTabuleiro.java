package classes;

import java.util.ArrayList;

public class JogoTabuleiro extends Item {
	ArrayList<String> pecas = new ArrayList<String>();

	/**
	 * construtor responsavel pelos atributos Jogo de Tabuleiro
	 * 
	 * @param nome
	 *            do item
	 * @param valor
	 *            do item
	 * @param estado
	 */
	public JogoTabuleiro(String nome, Double valor, boolean estado) {
		this.nome = nome;
		this.valor = valor;
		this.estado = estado;

	}
	public 

	/**
	 * metodo responsavel por mostrar pecas perdidas.
	 * 
	 * @return
	 */
	public String pecasPerdidas() {
		String pecasperdeu = " ";

		for (int i = 0; i <= pecas.size(); i++) {
			pecasperdeu += pecas.get(i) + " ";
		}
		return pecasperdeu;
	}

	public ArrayList<String> getPecas() {
		return pecas;
	}

	public void setPecas(ArrayList<String> pecas) {
		this.pecas = pecas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((super.nome == null) ? 0 : super.nome.hashCode());
		result = prime * result + ((pecas == null) ? 0 : pecas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JogoTabuleiro other = (JogoTabuleiro) obj;
		if (super.nome == null) {
			if (other.nome != null)
				return false;
		} else if (!super.nome.equals(other.nome))
			return false;
		if (pecas == null) {
			if (other.pecas != null)
				return false;
		} else if (!pecas.equals(other.pecas))
			return false;
		return true;
	}
	
	/**
	 * metodo que retorna o objeto jogo de Tabuleiro através de texto
	 */
	public String toString(){
		return super.getNome() + pecas;
	}

}