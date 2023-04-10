package trabalho;

import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {

	@Test
	public void testAluguel() {
		Van van = new Van("abc123", "Furgao", "Volkwagen", 20.00, "Van");
		double resultado_esperado = 40.00;
		double resultado = van.aluguel(2);
		
		assertTrue(resultado == resultado_esperado);
	}

	@Test
	public void testAlug() {
		Carro_Luxo luxo = new Carro_Luxo("def456", "Camaro", "Chevrolet", 500.00, "Luxo");
		double resultado_esperado = 4000.00;
		double resultado = luxo.aluguel(8);
		
		assertTrue(resultado == resultado_esperado);
	}

}
