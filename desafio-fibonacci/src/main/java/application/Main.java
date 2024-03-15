package application;

import java.util.Locale;
import java.util.Scanner;
import util.Fibonacci;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor para o programa verificar se pertence a sequência de Fibonacci.");
		System.out.println("Entre com um valor:");
		int num = sc.nextInt();

		int num2 = Fibonacci.pertenceFibonacci(num);

		if (num2 == -1) {
			System.out.printf("A sequencia de fibonacci não tem 0 ou números negativos!");
		} else if (num2 == -2) {
			System.out.println("Não pertence a sequência!");
		}else {
			System.out.printf("Pertence a sequência e está na posição %d", num2);
		}

		sc.close();
	}

}
