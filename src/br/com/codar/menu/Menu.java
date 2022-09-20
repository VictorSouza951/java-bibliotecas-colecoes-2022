package br.com.codar.menu;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import br.com.codar.service.ListarFormsPorArgupamento;
import br.com.codar.service.PesquisarForms;

public class Menu {
	private boolean sair = true;

	public void mostraMenu() {

		System.out.println("Bem vindo ao Movimento Codar!");
		System.out.println("---------------------");
		System.out.println("1 - Candidatar-se");
		System.out.println("2 - Adicionar pergunta ao formulario");
		System.out.println("3 - Remover pergunta do formulario");
		System.out.println("4 - Listar formularios cadastrados");
		System.out.println("5 - Pesquisar formularios cadastrados");
		System.out.println("6 - Validar formularios");
		System.out.println("0 - Sair");
	}

	public int escolhaUsuario() {
		EscolhaDoUsuario e = new EscolhaDoUsuario();
		return e.escolhaUsuario();
	}

	public boolean getExecutando() {
		return this.sair;
	}

	
	public void acessaMenu(int escolha) throws IOException {
		switch (escolha) {
		
		case 0:
			sair = false;
			System.out.println("Saindo...");
			break;
			
		case 1:
			Candidatarse c = new Candidatarse();
			c.candidatar();
			break;
			
		case 2:
			AddPergunta addP = new AddPergunta();
			addP.escrevePergunta();
			break;
			
		case 3:
			RemoverPergunta r = new RemoverPergunta();
			r.removePergunta();
			break;
			
		case 4:
			ListarFormsPorArgupamento f = new ListarFormsPorArgupamento();
			f.listarPerguntas();
			break;
			
		case 5:
			PesquisarForms p = new PesquisarForms();
			p.encontraForm();
			break;
			
		case 6:
			System.out.println("Validar");
			break;
			
		default:
			System.out.println("Valor invalido");
		}
	}

//	public void acessaMenu(int escolha) throws IOException {
//		switch (escolha) {
//		case 0:
//			sair = false;
//			System.out.println("Saindo...");
//			break;
//		case 1:
//			candidatar();
//			break;
//		case 2:
//			adicionarPergunta();
//			break;
//		case 3:
//			removePergunta();
//			break;
//		case 4:
//			listarForms();
//			break;
//		case 5:
//			pesquisarFormularios();
//			break;
//		case 6:
//			System.out.println("Validar");
//			break;
//		default:
//			System.out.println("Valor invalido");
//		}
//	}
//
//	private void candidatar() throws FileNotFoundException {
//		Candidatarse c = new Candidatarse();
//		c.candidatar();
//	}
//
//	private void adicionarPergunta() throws IOException {
//		AddPergunta addP = new AddPergunta();
//		addP.escrevePergunta();
//	}
//
//	private void removePergunta() throws IOException {
//		RemoverPergunta r = new RemoverPergunta();
//		r.removePergunta();
//	}
//
//	private void listarForms() throws IOException {
//		ListarFormsPorArgupamento f = new ListarFormsPorArgupamento();
//		f.listarPerguntas();
//	}
//
//	private void pesquisarFormularios() {
//		PesquisarForms p = new PesquisarForms();
//		p.encontraForm();
//	}

}
