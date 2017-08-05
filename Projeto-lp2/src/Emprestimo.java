/**
 * Projeto Lp2 - Tracking Things
 * @author Enzo Raian
 *
 */
public class Emprestimo {
	private String donoDoItem;
	private String tomadorDoEmprestimo;
	private String Item;
	private String inicioDoEmprestimo;
	private int diasCombinados;
	private String dataDevolucao;
	
	public Emprestimo(String donoDoItem, String tomadorDoEmprestimo, String item, String inicioDoEmprestimo,
			int diasCombinados, String dataDevolucao) {
		this.donoDoItem = donoDoItem;
		this.tomadorDoEmprestimo = tomadorDoEmprestimo;
		this.Item = Item;
		this.inicioDoEmprestimo = inicioDoEmprestimo;
		this.diasCombinados = diasCombinados;
		this.dataDevolucao = dataDevolucao;
	}
	
	public void Emprestimo(String donoDoItem, String tomadorDoEmprestimo, String Item, String inicioDoEmprestimo){
	// implementar metodo	
	}
	
	/**
	 * 
	 * @param diasAtraso 
	 * @param dataDeEntrega 
	 */
	public void devolverItem(String diasAtraso, String dataDeEntrega){
	// Falta implementar esse metodo	
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
	// Falta Equals
}
