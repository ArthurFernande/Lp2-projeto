package classes;

import java.util.HashSet;
/**
 * Esta eh a classe que represetara as series do sistema.
 * @author Italo Modesto
 *
 */

public class Serie extends BluRay{
	private String genero;
	private int temporada;
	HashSet<Episodio> episodios = new HashSet<Episodio>();
	/**
	 * Construtor da classe Serie.
	 * @param nome eh o nome da serie.
	 * @param valor eh o valor do vlu ray da serie.
	 * @param duracao eh a duracao total da serie.
	 * @param classificacao eh a classificacao, por idade, da serie.
	 * @param genero eh o genero da serie.
	 * @param temporada eh a temporada da serie.
	 */
	public Serie(String nome, double valor, int duracao,
			 int classificacao, String genero, int temporada){
		
		validaSerie(nome, valor, duracao, classificacao, genero, temporada);
		
		super.nome = nome;
		super.valor = valor;
		super.estado = false;
		super.duracao = duracao;
		super.classificacao = classificacao;
		this.genero = genero;
		this.temporada = temporada;
	}
	/**
	 * Verifica se os parametros passados para o construtor sao validos.
	 * @param nome eh o nome da serie.
	 * @param valor eh o valor do vlu ray da serie.
	 * @param duracao eh a duracao total da serie.
	 * @param classificacao eh a classificacao, por idade, da serie.
	 * @param genero eh o genero da serie.
	 * @param temporada eh a temporada da serie.
	 * @return true, se os parametros forem validos, ou lanca uma excecao.
	 */
	public boolean validaSerie(String nome, double valor, int duracao,
			 				   int classificacao, String genero, int temporada){
		if (nome == null){
			throw new NullPointerException("O nome nao pode ser nulo");
		}
		else if (nome == ""){
			throw new IllegalArgumentException("O nome nao pode ser vazio");
		}
		else if(valor < 0){
			throw new IllegalArgumentException("O valor nao pode ser negativo");
		}
		else if(duracao < 0){
			throw new IllegalArgumentException("A duracao nao pode ser negativa");
		}
		else if(classificacao < 0){
			throw new IllegalArgumentException("A classificacao nao pode ser negativa");
		}
		else if (classificacao > 18){
			throw new IllegalArgumentException("classificacao maior eh para maiores de 18 anos");
		}
		if (genero == null){
			throw new NullPointerException("O genero nao pode ser nulo");
		}
		else if (genero == ""){
			throw new IllegalArgumentException("O genero nao pode ser vazio");
		}
		else if(temporada < 1){
			throw new IllegalArgumentException("A temporada tem que ser maior ou igual a 1");
		}
		return true;
	}
	/**
	 * 
	 * @return o genero da serie.
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * Altera o genero da serie.
	 * @param genero sera o novo genero.
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * 
	 * @return a temporada da serie.
	 */
	public int getTemporada() {
		return temporada;
	}
	/**
	 * Altera a temporada da serie.
	 * @param temporada sera a nova temporada.
	 */
	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}
	/**
	 * 
	 * @return o episodios da serie.
	 */
	public HashSet<Episodio> getEpisodios() {
		return episodios;
	}
	/**
	 * @return a representacao textual da serie
	 */
	@Override
	public String toString(){
		return this.nome + " - " + this.valor + " - " + this.duracao + " - " + this.classificacao
				+ " - " + this.genero + " - " + this.temporada;	
	}
}
