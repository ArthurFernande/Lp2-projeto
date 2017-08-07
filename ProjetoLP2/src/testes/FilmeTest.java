package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Filme;

public class FilmeTest {
	private Filme filme;
	
	@Before
	public void criaFilme(){
		filme = new Filme("piratas do caribe", 10.0, 60,
				 				14, "acao", 2006);	
	}
	@Test
	public void FilmeTeste(){
		assertEquals("Nome do filme esta errado", "piratas do caribe",this.filme.getNome());
		assertEquals("Valor do filme esta errado", 10.0, this.filme.getValor(), 0.01);
		assertEquals("Duracao do Filme esta errada", 60,this.filme.getDuracao());
		assertEquals("Classificacao do filme esta errada", 14,this.filme.getClassificacao());
		assertEquals("Genero do filme esta errado", "acao",this.filme.getGenero());
		assertEquals("Ano do filme esta errado", 2006,this.filme.getAnoLancamento());
		
		this.filme.setNome("lagoa azul");
		this.filme.setValor(5.5);
		this.filme.setDuracao(83);
		this.filme.setClassificacao(18);
		this.filme.setGenero("terror");
		this.filme.setAnoLancamento(1999);
		
		assertEquals("Nome do filme esta errado", "lagoa azul",this.filme.getNome());
		assertEquals("Valor do filme esta errado", 5.5, this.filme.getValor(), 0.01);
		assertEquals("Duracao do Filme esta errada", 83,this.filme.getDuracao());
		assertEquals("Classificacao do filme esta errada", 18,this.filme.getClassificacao());
		assertEquals("Genero do filme esta errado", "terror",this.filme.getGenero());
		assertEquals("Ano do filme esta errado", 1999,this.filme.getAnoLancamento());
	}
	@Test
	public void toStringTeste(){
		assertEquals("Representacao textual esta errada",
					 "piratas do caribe - 10.0 - 60 - 14 - acao - 2006",
					 this.filme.toString());
	}
	@Test
	(expected = NullPointerException.class)
	public void validaFilmeNomeNulo(){
		filme = new Filme(null, 10.0, 60,	14, "acao", 2006);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaFilmeNomeVazio(){
		filme = new Filme("", 10.0, 60, 14, "acao", 2006);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaFilmeValorNegativo(){
		filme = new Filme("lagoa azul", -10.0, 60, 14, "acao", 2006);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaFilmeDuracNegativa(){
		filme = new Filme("lagoa azul", 10.0, -60, 14, "acao", 2006);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaFilmeClassifcNegativa(){
		filme = new Filme("lagoa azul", 10.0, 60, -14, "acao", 2006);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaFilmeClassifcMaior18(){
		filme = new Filme("lagoa azul", 10.0, 60, 19, "acao", 2006);
	}
	@Test
	(expected = NullPointerException.class)
	public void validaFilmeGeneroNulo(){
		filme = new Filme("lagoa azul", 10.0, 60, 18, null, 2006);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaFilmeGeneroVazio(){
		filme = new Filme("lagoa azul", 10.0, 60, 18, "", 2006);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaFilmeAnoLancNegativo(){
		filme = new Filme("lagoa azul", 10.0, 60, 18, "acao", -2006);
	}
}
