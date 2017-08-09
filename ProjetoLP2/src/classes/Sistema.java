package classes;

import java.util.HashMap;
import java.util.ArrayList;

public class Sistema {
	private HashMap<String, Usuario> ListaDeUsuarios = new HashMap();
	private ArrayList<Item> Itens = new ArrayList();
	
	public void adicionarUsuario(String nome,String telefone,String email){
		Usuario novoUs = new Usuario(nome,telefone,email);
		ListaDeUsuarios.put(novoUs.getNome(),novoUs);
	}
	
	public void removerUsuario(String nome,String telefone){
		if (ListaDeUsuarios.containsKey(nome)){
			ListaDeUsuarios.remove(nome);
		}
	}
	
	public void atualizarUsuario(String nome, String telefone){
		
	}

	public HashMap<String, Usuario> getListaDeUsuarios() {
		return ListaDeUsuarios;
	}
}
