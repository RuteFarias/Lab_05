package lab05;

import static org.junit.Assert.*;
import org.junit.Test;

public class CenarioTest {
	
	Cenario cenario;
	
	@org.junit.Before
	public void Before() throws Exception {
		cenario = new Cenario("Cenario1");
	}
	
	@Test
	public void criarCenario() throws Exception {
		cenario = new Cenario("Vou tirar 10 nesse lab!");
		assertEquals("1 - Vou tirar 10 nesse lab! - Nao finalizado", cenario.toString());
	}

	@Test(expected = NullPointerException.class)
	public void entradaNulaTest() throws Exception {
		cenario = new Cenario(null);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void entradaVaziaTest() throws Exception {
		cenario = new Cenario("  ");
	}

}
