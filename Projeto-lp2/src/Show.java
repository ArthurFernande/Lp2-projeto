package projeto;

/**
 * Projeto lp2 - Tracking Things
 * @author Enzo Raian 
 */
public class Show {
	private String artista;
	private int numDeFaixas;
	
	public Show(String artista, int numDeFaixas) {
		this.artista = artista;
		this.numDeFaixas = numDeFaixas;
	}

	public String getArtista() {
		return this.artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getNumDeFaixas() {
		return this.numDeFaixas;
	}

	public void setNumDeFaixas(int numDeFaixas) {
		this.numDeFaixas = numDeFaixas;
	}

	@Override
	public String toString() {
		return this.artista + " " + this.numDeFaixas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artista == null) ? 0 : artista.hashCode());
		result = prime * result + numDeFaixas;
		return result;
	}
	
	// Falta Equals
}
