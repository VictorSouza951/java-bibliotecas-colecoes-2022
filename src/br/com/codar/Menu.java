package br.com.codar;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
//	static boolean sair;
	private boolean sair = true;

	public void mostraMenu() {

		System.out.println("Bem vindo a tela de cadastro!");
		System.out.println("---------------------");
		System.out.println("1 - Candidatar-se");
		System.out.println("2 - Adicionar pergunta ao formulario");
		System.out.println("3 - Remover pergunta do formulario");
		System.out.println("4 - Listar formularios cadastrados");
		System.out.println("5 - Pesquisar formularios cadastrados");
		System.out.println("6 - Validar formularios");
		System.out.println("0 - Sair");
	}

//	public void executaMenu() throws IOException {
//		while (!sair) {
//			mostraMenu();
//			int escolha = escolhaUsuario();
//			entraMenu(escolha);
//		}
//	}

	public int escolhaUsuario() {

		Scanner sc = new Scanner(System.in);
		int escolha;
		System.out.println("\nDigite o numero do menu que quer acessar: ");
		escolha = Integer.parseInt(sc.nextLine());

		if (escolha < 0 | escolha > 6) {
			System.out.println("Numero invalido, tente novamente!");
		}

		return escolha;
	}
	
	public boolean getExecutando() {
		return this.sair;
	}

	public void entraMenu(int escolha) throws IOException {
		switch (escolha) {
		case 0:
			sair = false;
			System.out.println("Saindo...");
			break;
		case 1:
			candidatar();
			break;
		case 2:
			adicionarPergunta();
			break;
		case 3:
			removePergunta();
			break;
		case 4:
			listarForms();
			break;
		case 5:
			pesquisarFormularios();
			break;
		case 6:
			System.out.println("Validar");
//			sair = true;
			break;
		default: 
			System.out.println("Valor invalido");
		}
	}

	

	

	private void candidatar() throws FileNotFoundException {
		Candidatarse c = new Candidatarse();
		c.candidatar();
	}
	
	private void adicionarPergunta() throws IOException {
		AddPergunta addP = new AddPergunta();
		addP.escrevePergunta();
	}
	
	private void listarForms() throws FileNotFoundException {
		ListarForms f = new ListarForms();
		f.listarPerguntas();
	}
	
	private void removePergunta() throws IOException {
		RemoverPergunta r = new RemoverPergunta();
		r.removePergunta();
	}
	
	private void pesquisarFormularios() {
		PesquisarForms p = new PesquisarForms();
		p.encontraForm();
	
	}

	
}
