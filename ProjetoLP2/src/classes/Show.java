package classes;

import util.Util;

/**
 * Esta eh a classe que representa os shows do sistema.
 * 
 * @author Italo Modesto
 *
 */
public class Show extends BluRay {
	private String artista;
	private int numDeFaixas;

	/**
	 * Construtor da classe Show.
	 * 
	 * @param nome
	 *            eh o nome do show.
	 * @param valor
	 *            eh o valor do blu ray do show.
	 * @param duracao
	 *            eh a duracao do show.
	 * @param classificacao
	 *            eh a classificacao, por idade, do show.
	 * @param artista
	 *            eh o nome do artista.
	 * @param numDeFaixas
	 *            eh o numero de faixas do show.
	 */
	public Show(String nome, double valor, int duracao, int classificacao, String artista, int numDeFaixas) {
		super(nome, valor);

		Util.valida(artista, "artista");
		
		this.artista = artista;
		this.numDeFaixas = numDeFaixas;
	}

	/**
	 * Verifica se os parametros passados para o construtor sao validos.
	 * 
	 * @param valor
	 *            eh o valor do blu ray do show.
	 * @param duracao
	 *            eh a duracao do show.
	 * @param classificacao
	 *            eh a classificacao, por idade, do show.
	 * @param artista
	 *            eh o nome do artista.
	 * @param numDeFaixas
	 *            eh o numero de faixas do show.
	 * @return true, se os parametros forem validos, ou lanca uma excecao.
	 */
	public boolean validaShow(String nome, double valor, int duracao, int classificacao, String artista,
			int numDeFaixas) {
		if (nome == null) {
			throw new NullPointerException("O nome nao pode ser nulo");
		} else if (nome == "") {
			throw new IllegalArgumentException("O nome nao pode ser vazio");
		} else if (valor < 0) {
			throw new IllegalArgumentException("O valor nao pode ser negativo");
		} else if (duracao < 0) {
			throw new IllegalArgumentException("A duracao nao pode ser negativa");
		} else if (classificacao < 0) {
			throw new IllegalArgumentException("A classificacao nao pode ser negativa");
		} else if (classificacao > 18) {
			throw new IllegalArgumentException("classificacao maior eh para maiores de 18 anos");
		}
		if (artista == null) {
			throw new NullPointerException("O nome do artista nao pode ser nulo");
		} else if (artista == "") {
			throw new IllegalArgumentException("O nome do artista nao pode ser vazio");
		} else if (numDeFaixas < 0) {
			throw new IllegalArgumentException("O numero de faixas nao pode ser negativo");
		}
		return true;
	}

	/**
	 * 
	 * @return o nome do artista.
	 */
	public String getArtista() {
		return artista;
	}

	/**
	 * Altera o nome do artista.
	 * 
	 * @param artista
	 *            sera o novo nome do artista.
	 */
	public void setArtista(String artista) {
		this.artista = artista;
	}

	/**
	 * 
	 * @return o numero de faixas do show.
	 */
	public int getNumDeFaixas() {
		return numDeFaixas;
	}

	/**
	 * Altera o numero de faixas do show.
	 * 
	 * @param numDeFaixas
	 *            sera o novo numero de faixas
	 */
	public void setNumDeFaixas(int numDeFaixas) {
		this.numDeFaixas = numDeFaixas;
	}

	/**
	 * @return a representacao textual do show.
	 */
	@Override
	public String toString() {
		return this.nome + " - " + this.valor + " - " + this.duracao + " - " + this.classificacao + " - " + this.artista
				+ " - " + this.numDeFaixas;
	}

}
