package util;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import util.Fibonacci;

public class FibonacciTeste {
	
	// Aqui eu estou testando se está me retornando a posição correta da
	@Test
	public void testeRetornoFernebacci() {
		int num = 13;
		assertEquals(7, Fibonacci.pertenceFibonacci(num));
		num = Fibonacci.pertenceFibonacci(num);
		System.out.println(num);
	}
	
	// Aqui eu estou verificando se ele vai me retorna -1 se o número for negativo
	@Test
	public void testeNegativo() {
		int num = -13;
		assertEquals(-1, Fibonacci.pertenceFibonacci(num));
		num = Fibonacci.pertenceFibonacci(num);
		System.out.println(num);
	}
	
	// Aqui eu estou verificando se ele vai me retorna -2 se o número for negativo
		@Test
		public void testeCasoNãoPertence() {
			int num = 4;
			assertEquals(-2, Fibonacci.pertenceFibonacci(num));
			num = Fibonacci.pertenceFibonacci(num);
			System.out.println(num);
		}

}
