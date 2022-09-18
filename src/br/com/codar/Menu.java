package br.com.codar;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
	static boolean sair;

	private void mostraMenu() {

		System.out.println("Bem vindo a tela de cadastro!");
		System.out.println("---------------------");
		System.out.println("1 - Candidatar-se");
		System.out.println("2 - Adicionar pergunta ao formul�rio");
		System.out.println("3 - Remover pergunta do formul�rio");
		System.out.println("4 - Listar formul�rios cadastrados");
		System.out.println("5 - Pesquisar formul�rios cadastrados");
		System.out.println("6 - Validar formul�rios");
		System.out.println("0 - Sair");
	}

	public void executaMenu() throws IOException {
		while (!sair) {
			mostraMenu();
			int escolha = getEscolha();
			entraMenu(escolha);
		}
	}

	private int getEscolha() {

		Scanner sc = new Scanner(System.in);
		int escolha;
		System.out.println("\nDigite o numero do menu que quer acessar: ");
		escolha = Integer.parseInt(sc.nextLine());

		if (escolha < 0 | escolha > 6) {
			System.out.println("Numero invalido, tente novamente!");
		}

		return escolha;
	}

	private void entraMenu(int escolha) throws IOException {
		switch (escolha) {
		case 0:
			sair = true;
			System.out.println("Saindo...");
			break;
		case 1:
			candidatar();
			sair = true;
			break;
		case 2:
			adicionarPergunta();
			sair = true;
			break;
		case 3:
			removePergunta();
			sair = true;
			break;
		case 4:
			listarForms();
			sair = true;
			break;
		case 5:
			pesquisarFormularios();
			sair = true;
			break;
		case 6:
			System.out.println("Validar");
			sair = true;
			break;
			// retirar os breaks quando terminar os menus
		}
	}

	

	

	private void candidatar() throws FileNotFoundException {
		Candidatarse c = new Candidatarse();
		c.Candidatar();
	}
	
	private void adicionarPergunta() throws IOException {
		AddPergunta addP = new AddPergunta();
		addP.escrevePergunta();
	}
	
	private void listarForms() throws FileNotFoundException {
		ListarForms f = new ListarForms();
		f.listarPerguntas();
	}
	
	private void removePergunta() {
		RemoverPergunta r = new RemoverPergunta();
		r.removePergunta();
	}
	
	private void pesquisarFormularios() {
		PesquisarForms p = new PesquisarForms();
	
	}

	
}
