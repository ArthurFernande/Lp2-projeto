package classes;
import java.util.HashMap;

public class Sistema {
	private HashMap<String,Usuario> ListaDeUsuarios = new HashMap();

	public void addUsuario(String nome, String email, String numero){
		Usuario novoUs = new Usuario(nome,email,numero);
		ListaDeUsuarios.put(novoUs.getNome(),novoUs);
	}
	
	public void removerUsuario(String nome){
		for (usuario : ListaDeUsuarios){
			
		}
		
	}
}
