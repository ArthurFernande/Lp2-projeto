package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Show;

public class ShowTest {
	Show show = null;
	
	@Before
	public void criaShow(){
		show = new Show("o grande encontro",25, 120, 0, "alceu valenca", 12);	
	}
	@Test
	public void ShowTeste(){
		assertEquals("O nome do show esta errado", "o grande encontro", this.show.getNome());
		assertEquals("O valor está errado", 25.0,this.show.getValor(), 0.001);
		assertEquals("A duracao esta errada", 120,this.show.getDuracao(), 0.01);
		assertEquals("A classificacão está errada", 0,this.show.getClassificacao());
		assertEquals("O artista esta errado", "alceu valenca",this.show.getArtista());
		assertEquals("O numero de faixas esta errado", 12,this.show.getNumDeFaixas());

		this.show.setNome("perfil");
		this.show.setValor(19.0);
		this.show.setDuracao(100);
		this.show.setClassificacao(10);
		this.show.setArtista("o rappa");
		this.show.setNumDeFaixas(14);
		
		assertEquals("O nome do show esta errado", "perfil", this.show.getNome());
		assertEquals("O valor está errado", 19.0,this.show.getValor(), 0.001);
		assertEquals("A duracao esta errada", 100,this.show.getDuracao(), 0.01);
		assertEquals("A classificacão está errada", 10,this.show.getClassificacao());
		assertEquals("O artista esta errado", "o rappa",this.show.getArtista());
		assertEquals("O numero de faixas esta errado", 14,this.show.getNumDeFaixas());
	}
	@Test
	public void toStringTeste(){
		assertEquals("A representacao textual esta errada",
					 "o grande encontro - 25.0 - 120 - 0 - alceu valenca - 12",
					 this.show.toString());
	}
	@Test
	(expected = NullPointerException.class)
	public void validaShowNomeNulo(){
		show = new Show(null,25, 120, 0, "alceu valenca", 12);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaShowNomeVazio(){
		show = new Show("",25, 120, 0, "alceu valenca", 12);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaShowValorNegativo(){
		show = new Show("o grande encontro", -25, 120, 0, "alceu valenca", 12);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaShowDuracNegativa(){
		show = new Show("o grande encontro",25, -120, 0, "alceu valenca", 12);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaShowClassifcNegativa(){
		show = new Show("o grande encontro",25, 120, -1, "alceu valenca", 12);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaShowClassifcMaior18(){
		show = new Show("o grande encontro",25, 120, 19, "alceu valenca", 12);
	}
	@Test
	(expected = NullPointerException.class)
	public void validaShowArtistaNulo(){
		show = new Show("o grande encontro",25, 120, 0, null, 12);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaShowArtistaVazio(){
		show = new Show("o grande encontro",25, 120, 0, "", 12);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaShowNumDeFaixasNegativo(){
		show = new Show("o grande encontro",25, 120, 0, "alceu valenca", -12);
	}
}
