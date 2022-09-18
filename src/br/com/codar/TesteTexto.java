package br.com.codar;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TesteTexto {

	public static void main(String[] args) {

		
		String nome = criaAluno().nome;
		
		
		File fos = new File(nome + ".txt");
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(fos);
			Aluno aluno = null;
			aluno = criaAluno();
			pw.println(aluno.toString());
			pw.close();
		}
		catch(IOException e) {
			System.out.println("Erro");
		}
		
	}
	public static Aluno criaAluno() {
		String nome = "Victor";
		String email = "victro.ssdosiuujsoi@giodipofd.com";
		int idade = 50;
		String telefone = "11 9898-98989";

		Aluno aluno = new Aluno(nome, email, idade, telefone);

		return aluno;
		
	}
}
