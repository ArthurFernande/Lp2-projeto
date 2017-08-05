package projeto;
/**
 * Projeto Lp2 - Tracking Things
 * @author Arthur Fernandes
 */

public class JogoEletronico {
	private String plataforma;
	
	public JogoEletronico(String plataforma){
		this.plataforma = plataforma;
	}

	public String getPlataforma() {
		return this.plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String toString(){
		return this.plataforma;
	}
	
	// Falta Hashcode e Equals
}
