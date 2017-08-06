package projeto;
import java.util.ArrayList;

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
	private ArrayList <Object> ListaDeItens = new ArrayList(); 
	
	public Emprestimo(String donoDoItem, String tomadorDoEmprestimo, String item, String inicioDoEmprestimo,
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
		Emprestimo novoEmprestimo = new Emprestimo(donoDoItem,tomadorDoEmprestimo,Item,inicioDoEmprestimo,diasCombinados,dataDevolucao);
		if (ListaDeItens.contains(novoEmprestimo)){
			return "O Item indicado já está emprestado";
		}
		else{
			ListaDeItens.add(novoEmprestimo);
			return "Emprestimo efetuado com sucesso!";
		}
	}
	
	/**
	 * Este metodo é responsavel por devolver itens 
	 * @param Item indica o item que deve ser devolvido.
	 * @param diasAtraso indica a quantidade de dias que o item está atrasado. 
	 * @param dataDeEntrega indica a data real de entrega do item.
	 * @return item devolvido ou o item nao está emprestado
	 */
	public String devolverItem(String Item, String diasAtraso, String dataDeEntrega){
		for (Object item : ListaDeItens){
			if (((Emprestimo) item).getItem() == item){ 
				ListaDeItens.remove(item);
				return "Item devolvido com sucesso!";
			}
		}
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
	// Falta Equals
}
