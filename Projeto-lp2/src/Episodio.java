package projeto;

/**
 * Projeto Lp2 - Tracking Things
 * @author Enzo Raian
 *
 */

public class Episodio {
	private int NumEpisodio;
	private float duracao;
	
	public void Episodio(){
		this.NumEpisodio = NumEpisodio;
		this.duracao = duracao;
	}

	public int getNumEpisodio() {
		return this.NumEpisodio;
	}

	public float getDuracao() {
		return this.duracao;
	}
	
	public String toString(){
		return this.NumEpisodio + " - " + this.duracao;
	}
}
