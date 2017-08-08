package classes;
/**
 * Esta eh a classe que representa os filmes do sistema.
 * @author Italo Modesto.
 *
 */
public class Filme extends BluRay{
	private String genero;
	private int anoLancamento;
	/**
	 * Construtor da classe Filme.
	 * @param nome eh o nome do filme.
	 * @param valor eh o valor do filme.
	 * @param duracao eh a duracao do filme.
	 * @param classificacao eh a classificacao, por idade, do filme.
	 * @param genero eh o genero do filme.
	 * @param anoLancamento eh o ano de lancamento do filme.
	 */
	public Filme(String nome, double valor, int duracao, int classificacao, String genero, int anoLancamento)
	
	{
		super(nome, valor);
		validaFilme(nome, valor, duracao, classificacao, genero, anoLancamento);
		
		this.genero = genero;
		this.anoLancamento = anoLancamento;
	}
	/**
	 * Verifica se os parametros passados para o construtor sao validos.
	 * @param nome eh o nome do filme.
	 * @param valorString eh o valor do filme.
	 * @param duracaoString eh a duracao do filme.
	 * @param classificacaoString eh a classificacao, por idade, do filme.
	 * @param genero eh o genero do filme.
	 * @param anoLancamentoString eh o ano de lancamento do filme.
	 * @return true se todos os parametros forem validos, ou lanca uma excecao
	 */
	public boolean validaFilme(String nome, double valor, int duracao,
			 int classificacao, String genero, int anoLancamento){
		
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
		else if(anoLancamento < 0){
			throw new IllegalArgumentException("O ano nao pode ser negativo");
		}
		return true;
	}
	/**
	 * 
	 * @return o genro do filme.
	 */
	public String getGenero() {
		return genero;
	}
	/**
	 * Altera o genero do filme.
	 * @param genero sera o novo genero.
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}
	/**
	 * 
	 * @return o ano de lancamento do filme.
	 */
	public int getAnoLancamento() {
		return anoLancamento;
	}
	/**
	 * Altera o ano de lancamento do filme
	 * @param anoLancamento sera o novo ano de lancamento.
	 */
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}	
	/**
	 * @return a representacao textual do filme.
	 */
	@Override
	public String toString(){
		return this.nome + " - " + this.valor + " - " + this.duracao + " - " + this.classificacao
				+ " - " + this.genero + " - " + this.anoLancamento;
	}
}
