package classes;
import java.util.HashMap;

public class Sistema {
	private HashMap<String,Usuario> ListaDeUsuarios = new HashMap();

	public void addUsuario(String nome, String email, String celular){
		Usuario novoUs = new Usuario(nome,email,celular);
		ListaDeUsuarios.put(novoUs.getNome(),novoUs);
	}
	
	public void removerUsuario(String nome,String celular){
		if (ListaDeUsuarios.containsKey(nome)){
			ListaDeUsuarios.remove(nome);
		}
	}
	
	public void atualizarUsuario(){
		
	}
}
