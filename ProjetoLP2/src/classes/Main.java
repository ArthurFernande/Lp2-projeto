package classes;
import classes.Sistema;


public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        
        
        sistema.adicionarUsuario("joao", "234", "joao@ccc");
        sistema.adicionarUsuario("corrinha", "123", "corrinha@ff");
        System.out.println(sistema.getListaDeUsuarios().get("joao").toString());
        System.out.println(sistema.getListaDeUsuarios().get("corrinha").toString());
    }
}
