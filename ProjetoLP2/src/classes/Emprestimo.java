package classes;

/**
 * Projeto Lp2 - Tracking Things
 * @author Enzo Raian
 */
public class Emprestimo {
	private String donoDoItem;
	private String tomadorDoEmprestimo;
	private String Item;
	private String inicioDoEmprestimo;
	private int diasCombinados;
	private String dataDevolucao;

	public Emprestimo(String donoDoItem, String tomadorDoEmprestimo, String Item, String inicioDoEmprestimo,
					  int diasCombinados, String dataDevolucao) {
		this.donoDoItem = donoDoItem;
		this.tomadorDoEmprestimo = tomadorDoEmprestimo;
		this.Item = Item;
		this.inicioDoEmprestimo = inicioDoEmprestimo;
		this.diasCombinados = diasCombinados;
		this.dataDevolucao = dataDevolucao;
	}
	
	/**
	 * Este metodo é responsavel por realizar emprestimos
	 * @param donoDoItem indica o nome do dono do item.
	 * @param tomadorDoEmprestimo o nome do usuário que pegou o item.
	 * @param Item indica o item emprestado.
	 * @param inicioDoEmprestimo indica a data que o item foi emprestado.
	 * @return Emprestimo Efetuado ou Não Efetuado.
	 */
	public String Emprestimo(String donoDoItem, String tomadorDoEmprestimo, String Item, String inicioDoEmprestimo){
		return "";
	}
	
	/**
	 * Este metodo é responsavel por devolver itens. 
	 * @param Item indica o item que deve ser devolvido.
	 * @param diasAtraso indica a quantidade de dias que o item está atrasado. 
	 * @param dataDeEntrega indica a data real de entrega do item.
	 * @return item devolvido ou o item nao está emprestado
	 */
	public String devolverItem(String diasAtraso, String dataDeEntrega){
		// usar metodo pesquisar item da classe Sistema
		return "O item não está emprestado";
	}
	
	public String getDataDevolucao() {
		return this.dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public String getDonoDoItem() {
		return this.donoDoItem;
	}

	public String getTomadorDoEmprestimo() {
		return this.tomadorDoEmprestimo;
	}

	public String getItem() {
		return this.Item;
	}

	public String getInicioDoEmprestimo() {
		return this.inicioDoEmprestimo;
	}

	public int getDiasCombinados() {
		return this.diasCombinados;
	}
	// Falta Equals e HashCode
	
}
