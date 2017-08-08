package classes;

import java.util.ArrayList;

public class JogoTabuleiro extends Item {

	public JogoTabuleiro(String nome, double valor) {
		super(nome, valor);

	}

	ArrayList<String> pecas = new ArrayList<String>();

	/**
	 * metodo responsavel por adicionar as pecas
	 * 
	 * @return
	 */
	public void adicionarPecasperdidas(String nomePecas) {
		this.pecas.add(nomePecas);

	}

	/**
	 * metodo responsavel por verificar se alguma peca foi retirada
	 * 
	 * @return
	 */

	public boolean Pecasperdidas() {
		return pecas.size() == 0;
	}

	/**
	 * gets e sets
	 * 
	 * @return
	 */

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
	public String toString() {
		return super.getNome() + pecas;
	}

}