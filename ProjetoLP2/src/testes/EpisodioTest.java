package testes;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Episodio;;

public class EpisodioTest {
	Episodio episodio;
	
	@Before
	public void criaEpsodio(){
		episodio = new Episodio(1, 40);
	}
	@Test
	public void episodioTeste(){
		assertEquals("Numero do episodio esta errado", 1,this.episodio.getNumEpisodio());
		assertEquals("Duracao do episodio esta errada", 40, this.episodio.getDuracao());
	}
}
