package classes;
import java.util.HashSet;
import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String email;
	private String telefone;
	
	private HashSet <Item> Itens = new HashSet();
	private ArrayList <Emprestimo> Emprestimos = new ArrayList();

	public Usuario(String nome, String email, String numero) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setCelular(String telefone) {
		this.telefone = telefone;
	}
	
	public void cadastrarEletronico(String nome, String telefone, String nomeItem,
			double preco, String plataforma){
		
		
	}
	
	public void cadastrarJogoTabuleiro(String nome,String telefone,
			String nomeItem,double preco){
	
	}
	
	public void cadastrarBluRayFilme(String nome,String telefone,String nomeItem,double preco,
			int duracao,String genero,String classificacao, String anoLancamento){
		
	}
	
	public void cadastrarBluRayShow(String nome,String telefone,String nomeItem, double preco,int duracao,
			int numeroFaixas,String artista, String classicacao){
		
	}
	
	public void cadastrarBluRaySerie(String nome,String telefone,String nomeItem,double preco,String descricao,
			int duracao,String classificacao,String genero, int temporada){
		
	}
	
	public void removerItem (String nome, String telefone,String nomeItem){
		
	}
	public void atualizarItem(String nome,String telefone,String nomeItem,String atributo,String valor){
		
	}
	
	public String pesquisarItem(String nome, String telefone, String nomeItem){
		return "";
	}
	
	
	@Override
	public String toString() {
		return this.nome + "," + this.email + "," + this.telefone;
	}

	// Falta HashCode e Equals

}

