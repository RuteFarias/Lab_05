package lab05;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

import lab05.Sistema;

public class SistemaTest {

	private static final String NL = System.lineSeparator();
	private Sistema sistema;
	
	@Before
	public void criarSistema() throws Exception {
		sistema = new Sistema();
		sistema.inicializa(0, 0.01);
	}
	
		
	@Test(expected = Exception.class)
	public void inicializaCaixaNegativoTest() throws Exception {
		sistema.inicializa(-1, 0.01);			
	}
	
	@Test(expected = Exception.class)
	public void inicializaTaxaNegativaTest() throws Exception {
		sistema.inicializa(0, -1);		
	}
	
	@Test
	public void getCaixaTest() throws Exception {
		sistema.inicializa(1000, 0.01);
		assertEquals(1000, sistema.getCaixa());
		
	}
	
	@Test
	public void exibirCenarioTest() throws Exception {
		sistema.cadastrarCenario("O aluno Viktor Borgino vai pagar PLP");
		sistema.cadastrarCenario("Hoje vai fazer -30 graus em Campina");
		sistema.cadastrarCenario("Todos os alunos comparecerao a aula de LP2 nessa terca");
		assertEquals("1 - O aluno Viktor Borgino vai pagar PLP - Nao finalizado", sistema.exibirCenario(1));
		assertEquals("2 - Hoje vai fazer -30 graus em Campina - Nao finalizado", sistema.exibirCenario(2));
		assertEquals("3 - Todos os alunos comparecerao a aula de LP2 nessa terca - Nao finalizado", sistema.exibirCenario(3));
	}
	
		
	@Test(expected = Exception.class)
	public void exibirCenarioNegativoTest() throws Exception {
		sistema.cadastrarCenario("ccc");
		sistema.exibirCenario(-1);
		
	}
	
	@Test(expected = Exception.class)
	public void exibirCenarioInexistenteTest() throws Exception {
		sistema.cadastrarCenario("ccc");
		sistema.exibirCenario(9);
	}
	
	@Test
	public void exibirCenariosTest() throws Exception {
		sistema.cadastrarCenario("O aluno Viktor Borgino vai pagar PLP");
		sistema.cadastrarCenario("Hoje vai fazer -30 graus em Campina");
		assertEquals("1 - O aluno Viktor Borgino vai pagar PLP - Nao finalizado" + NL + "2 - Hoje vai fazer -30 graus em Campina - Nao finalizado", sistema.exibirCenarios());
		
	}
	
	
	
		
	
}
