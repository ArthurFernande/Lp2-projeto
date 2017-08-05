package projeto;

/**
 * Projeto lp2 - Tracking Things
 * @author Enzo Raian
 */
public class Serie {
	private String genero;
	private int temporada;
	// falta hashset
	
	public Serie(String genero, int temporada){
		this.genero = genero;
		this.temporada = temporada;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public String toString(){
		return this.genero + " " + this.temporada;
	}
	// Falta getepisodios
	// Falta hashcode e equals
	
}
