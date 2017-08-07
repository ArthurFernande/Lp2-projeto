package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.Serie;

public class SerieTest {
	Serie serie;
	
	@Before
	public void criaSerie(){
		serie = new Serie("narcos", 10.0, 600, 16, "acao", 1);
	}
	@Test
	public void SerieTeste(){
		assertEquals("O nome esta errado", "narcos", this.serie.getNome());
		assertEquals("O valor esta errado", 10.0, this.serie.getValor(), 0.01);
		assertEquals("A duracao esta errada", 600, this.serie.getDuracao(), 0.001);
		assertEquals("A classificacao esta errado", 16, this.serie.getClassificacao());
		assertEquals("O genero esta errado", "acao", this.serie.getGenero());
		assertEquals("A temporada esta errada", 1, this.serie.getTemporada());
		
		this.serie.setNome("mr robot");
		this.serie.setValor(100.0);
		this.serie.setDuracao(540);
		this.serie.setClassificacao(0);
		this.serie.setGenero("drama/suspense");
		this.serie.setTemporada(2);
		
		assertEquals("O nome esta errado", "mr robot", this.serie.getNome());
		assertEquals("O valor esta errado", 100.0, this.serie.getValor(), 0.01);
		assertEquals("A duracao esta errada", 540, this.serie.getDuracao(), 0.001);
		assertEquals("A classificacao esta errado", 0, this.serie.getClassificacao());
		assertEquals("O genero esta errado", "drama/suspense", this.serie.getGenero());
		assertEquals("A temporada esta errada", 2, this.serie.getTemporada());
	}
	@Test
	public void toStringTeste(){
		assertEquals("A representacao textual esta errada",
					 "narcos - 10.0 - 600 - 16 - acao - 1",
					 this.serie.toString());
	}
	@Test
	(expected = NullPointerException.class)
	public void validaSerieNomeNulo(){
		serie = new Serie(null, 10.0, 600, 16, "acao", 1);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaSerieNomeVazio(){
		serie = new Serie("", 10.0, 600, 16, "acao", 1);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaSerieValorNegativo(){
		serie = new Serie("narcos", -10.0, 600, 16, "acao", 1);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaSerieDuracNegativa(){
		serie = new Serie("narcos", 10.0, -600, 16, "acao", 1);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaSerieClassifcNegativa(){
		serie = new Serie("narcos", 10.0, 600, -16, "acao", 1);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaSerieClassifcMaior18(){
		serie = new Serie("narcos", 10.0, 600, 19, "acao", 1);
	}
	@Test
	(expected = NullPointerException.class)
	public void validaSerieGeneroNulo(){
		serie = new Serie("narcos", 10.0, 600, 16, null, 1);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaSerieGeneroVazio(){
		serie = new Serie("narcos", 10.0, 600, 16, "", 1);
	}
	@Test
	(expected = IllegalArgumentException.class)
	public void validaSerieTempMenorQ1(){
		serie = new Serie("narcos", 10.0, 600, 16, "acao", 0);
	}
}
