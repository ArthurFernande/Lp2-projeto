package projeto;

public class Filme {
	private String genero;
	private int anoLancamento;
	
	public Filme(){
		this.genero = genero;
		this.anoLancamento = anoLancamento;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoLancamento() {
		return this.anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	public String toString(){
		return this.genero + " " + this.anoLancamento;
	}
	
	//Falta Hashcode e Equals
}
