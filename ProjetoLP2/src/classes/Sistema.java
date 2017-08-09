package classes;

import java.util.HashMap;
import java.util.ArrayList;

public class Sistema {
	private HashMap<Chave, Usuario> mapaDeUsuarios = new HashMap();
	private ArrayList<Item> Itens = new ArrayList();
	
	public void cadastrarUsuario(String nome,String telefone,String email){
		Chave chave = new Chave(nome, telefone);
		Usuario usuario = new Usuario(nome,telefone,email);
		mapaDeUsuarios.put(chave,usuario);
	}
	
	public void removerUsuario(String nome,String telefone){
		Chave chave = new Chave(nome, telefone);
		if (mapaDeUsuarios.containsKey(chave)){
			mapaDeUsuarios.remove(chave);
		}
	}
	
	public void atualizarUsuario(String nome, String telefone, String atributo, String valor){
		Chave chave = new Chave(nome,telefone);
		mapaDeUsuarios.remove(chave);
		switch(atributo){
			case "Telefone":
				mapaDeUsuarios.get(chave).setTelefone(valor);
				Usuario usuarioTemporario = mapaDeUsuarios.get(chave);
				mapaDeUsuarios.remove(chave);
				chave.setTelefone(valor);
				mapaDeUsuarios.put(chave, usuarioTemporario);
				break;
			case "Email":
				mapaDeUsuarios.get(chave).setEmail(valor);
				break;
			case "Nome":
				mapaDeUsuarios.get(chave).setNome(valor);
				Usuario usuarioTemporario1 = mapaDeUsuarios.get(chave);
				mapaDeUsuarios.remove(chave);
				chave.setNome(valor);
				mapaDeUsuarios.put(chave,usuarioTemporario1);
				break;
			default:
				throw new IllegalArgumentException ("Atributo invalido");
			}
		}
	public String getInfoUsuario(String nome, String telefone, String atributo){
		Chave chave = new Chave(nome,telefone);
		switch(atributo){
		case "Telefone":
			return mapaDeUsuarios.get(chave).getTelefone();
		case "Email":
			return mapaDeUsuarios.get(chave).getEmail();
		case "Nome":
			return mapaDeUsuarios.get(chave).getNome();
		default:
			throw new IllegalArgumentException ("Atributo invalido");
		}
	}
}
