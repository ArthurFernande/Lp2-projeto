package classes;

public class JogoEletronico extends Item {
	private String plataforma;
	
	
	
	public JogoEletronico(String plataforma){
		this.plataforma = plataforma;
	}


	public String getPlataforma() {
		return plataforma;
	}


	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

}