package classes;
/**
 * Esta eh a classe que vai compor a colecao de episodios da classe "Serie".
 * @author Italo Modesto.
 *
 */
public class Episodio {
	private int numEpisodio;
	private int duracao;
	/**
	 * Construtor da classe Episodio.
	 * @param numEpisodio eh o numero do epidodio.
	 * @param duracao eh a duracao do epsodio.
	 */
	public Episodio(int numEpisodio, int duracao){
		this.numEpisodio = numEpisodio;
		this.duracao = duracao;
	}
	/**
	 * 
	 * @return o numero do episodio.
	 */
	public int getNumEpisodio() {
		return numEpisodio;
	}
	/**
	 * 
	 * @returna duracao do episodio.
	 */
	public int getDuracao() {
		return duracao;
	}
}
