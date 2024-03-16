package application;

import java.util.Locale;
import java.util.Scanner;

import entitis.Inversor;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um frase para ser invertida: ");
		String frase= sc.nextLine();
		
		Inversor str = new Inversor(frase);
		
		System.out.println(str.inversoDeString());
		
		
		sc.close();
	}

}
