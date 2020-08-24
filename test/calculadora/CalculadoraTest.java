package calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void configura() {
		calc = new Calculadora();
	}
	
	@Test
	public void testSoma() {
		assertEquals("Soma incorreta", calc.soma(1, 1), 2);
	}
	
	@Test
	public void testaSubtracao() {
		assertEquals("Subtra��o incorreta", calc.subtracao(0, 0), 0);
	}

	@Test
	public void testaMultiplicacao() {
		assertEquals("Multiplica��o incorreta", calc.multiplicacao(0, 0), 0);
	}
	
	@Test
	public void testaDivisao() {
		assertEquals("Divis�o incorreta", calc.divisao(1, 1), 1);
	}	
	

	
	@Test
	public void testaPositivoVerdadeiro() {
		assertTrue("O valor � negativo incorretamente", calc.ehPositivo(1));		
	}	
	
	@Test
	public void testaPositivoFalso() {
		assertFalse("O valor � positivo incorretamente", calc.ehPositivo(-1));		
	}	
	
	@Test
	public void testaSomatorioZero() {
		assertEquals("Somatorio de 0 incorreto", calc.somatoria(0), 0);		
	}
	
	@Test
	public void testaSomatorioUm() {
		assertEquals("Somatorio de 1 incorreto", calc.somatoria(1), 1);		
	}	
	
	
	@Test
	public void testaSomatorioDois() {
		assertEquals("Somatorio de 2 incorreto", calc.somatoria(2), 3);		
	}	

	@Test
	public void testaComparaIgual() {
		assertEquals("Compara n�meros iguais incorreto", calc.compara(0, 0), 0);		
	}	
	
	@Test
	public void testaComparaMaior() {
		assertEquals("Compara primeiro n�mero maior incorreto", calc.compara(1, 0), 1);		
	}	

	@Test
	public void testaComparaMenor() {
		assertEquals("Compara segundo n�mero maior incorreto", calc.compara(0, 1), -1);		
	}			
}
