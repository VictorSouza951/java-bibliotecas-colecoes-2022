package br.com.codar.menu;

import java.util.Scanner;

public class EscolhaDoUsuario {

	public  int escolhaUsuario() {

		Scanner sc = new Scanner(System.in);
		int escolha;
		System.out.println("\nDigite o numero do menu que quer acessar: ");
		escolha = Integer.parseInt(sc.nextLine());

		if (escolha < 0 | escolha > 6) {
			System.out.println("Numero invalido, tente novamente!");
		}

		return escolha;
	}
}
