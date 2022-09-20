package br.com.codar.main;

import java.io.IOException;

import br.com.codar.menu.Menu;

public class Main {

	public static void main(String[] args) throws IOException {
		Menu menu = new Menu();

		while (menu.getExecutando()) {
			menu.mostraMenu();
			int escolha = menu.escolhaUsuario();
			menu.acessaMenu(escolha);
		}
	}

}