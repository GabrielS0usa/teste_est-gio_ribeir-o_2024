package entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entitis.Inversor;

public class InversorTeste {
	
	//Aqui eu estou testando se vai me retorna a string invertida
		@Test
		public void testTextSucesso() {
			String str = "Gabriel";
			assertEquals("leirbaG", new Inversor(str).inversoDeString());
		}
	
}
