package br.com.codar.teste;

import java.io.IOException;

import br.com.codar.Menu;

public class TesteMenu {
	public static void main(String[] args) throws IOException {
		
		Menu menu = new Menu();
		
		while (menu.getExecutando()) {
			menu.mostraMenu();
			int escolha = menu.escolhaUsuario();
			menu.entraMenu(escolha);
		}
	}

}
