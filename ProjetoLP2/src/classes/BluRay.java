package classes;
/**
 * Esta classe sevira de base para as classes filhas: "Filme", "Serie" e "Show".
 * @author Italo Modesto.
 *
 */
public abstract class BluRay extends Item{
	protected int duracao;
	protected int classificacao;
	/**
	 * 
	 * @return a duracao do blu ray.
	 */
	public int getDuracao() {
		return duracao;
	}
	/**
	 * Altera a duracao do blu ray.
	 * @param duracao eh a nova duracao.
	 */
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	/**
	 * 
	 * @return a classificacao.
	 */
	public int getClassificacao() {
		return classificacao;
	}
	/**
	 * Altera a classificacao do blu ray.
	 * @param classificacao sera a nova classificacao.
	 */
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	/**
	 * @return a representacao textual do bluray.
	 */
	@Override
	public String toString(){
		return this.getNome() + " - " + this.getValor() + " - " + this.getDuracao() + " - " + this.getClassificacao();
	}
	
	
}
