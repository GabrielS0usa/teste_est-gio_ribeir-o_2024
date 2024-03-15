package util;

public class Fibonacci {

	// Aqui eu estou verificando se pertence a sequência de Fibonacci. Se pertencer
	// ela me retorna a posição.
	
	public static int pertenceFibonacci(int n) {
		int n1 = 1, n2 = 1, n3 = 0;
		int posicao = 2; // Comecei da terceira posição, pois as duas primeiras posições já foram verificadas
		if (n <= 0) {
			return -1; // Se o número for negativo ou zero ele me retorna - 1
		} else if (n == n1) {
			return 1;
		}
		while (n3 <= n) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			posicao++;
			if (n == n3) {
				return posicao;
			}
		}
		return -2; // Se não pertencer à sequência de Fibonacci, retorna -2
	}
}

