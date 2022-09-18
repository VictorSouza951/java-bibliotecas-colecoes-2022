package br.com.codar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;

public class Candidatarse {
	
	public static Aluno criaAluno() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o seu nome completo?");
		String nome = sc.nextLine();
		
		System.out.println("Qual seu e-mail?");
		String email = sc.nextLine();
		
		System.out.println("Qual seu whatsapp ou celular?");
		String telefone = sc.nextLine();
		
		System.out.println("Qual sua idade?");
		int idade = sc.nextInt();

		if (idade < 16) {
			System.out.println("Obrigado pelo interesse, mas a idade mimima e 16 anos.");
			System.out.println("Tente faze a inscricao novamente quando completar 16 anos.");
			System.exit(0);
		}
		

		Aluno aluno = new Aluno(nome, email, idade, telefone);
		sc.close();
		return aluno;
		
	}

	public void Candidatar() throws FileNotFoundException {

		String nome = criaAluno().nome;
		
		File fos = new File(nome + ".txt");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(fos);
			Aluno aluno = null;
			aluno = criaAluno();
			pw.println(aluno.toString());
			System.out.println("Cadastro completo!");
			pw.close();
		}
		catch(IOException e) {
			System.out.println("Erro");
		}
		
		

	}
	
	
	
}
