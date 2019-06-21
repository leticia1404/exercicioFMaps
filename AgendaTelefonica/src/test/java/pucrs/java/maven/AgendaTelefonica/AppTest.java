package pucrs.java.maven.AgendaTelefonica;


import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class AppTest {
	
	AgendaTelefonica colecao;
	
	@Before
	public void setup() {
		colecao = new AgendaTelefonica();
		colecao.inserir("Letícia", "111111111");
	}
	
	@Test
	public void testBuscarNumero() {
		assertEquals("111111111", colecao.buscarNumero("Letícia"));
		
	}
	
	@Test
	public void testTamanho() {
		assertEquals(1, colecao.tamanho());
		
	}
	
}
