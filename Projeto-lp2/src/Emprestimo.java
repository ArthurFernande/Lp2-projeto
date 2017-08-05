/**
 * Projeto Lp2 - Tracking Things
 * @author enzortc
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
		
	}
	
	/**
	 * 
	 * @param diasAtraso 
	 * @param dataDeEntrega 
	 */
	public void devolverItem(String diasAtraso, String dataDeEntrega){
		
	}
	
	
	
	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public String getDonoDoItem() {
		return donoDoItem;
	}

	public String getTomadorDoEmprestimo() {
		return tomadorDoEmprestimo;
	}

	public String getItem() {
		return Item;
	}

	public String getInicioDoEmprestimo() {
		return inicioDoEmprestimo;
	}

	public int getDiasCombinados() {
		return diasCombinados;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Item == null) ? 0 : Item.hashCode());
		result = prime * result + ((dataDevolucao == null) ? 0 : dataDevolucao.hashCode());
		result = prime * result + diasCombinados;
		result = prime * result + ((donoDoItem == null) ? 0 : donoDoItem.hashCode());
		result = prime * result + ((inicioDoEmprestimo == null) ? 0 : inicioDoEmprestimo.hashCode());
		result = prime * result + ((tomadorDoEmprestimo == null) ? 0 : tomadorDoEmprestimo.hashCode());
		return result;
	}
	
	// Falta Equals
}
