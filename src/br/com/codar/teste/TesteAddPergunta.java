package br.com.codar.teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class TesteAddPergunta {

	public static void main(String[] args) throws IOException {

		String pergunta;
		long numeroDaPergunta = Files.lines(Paths.get("formulario.txt")).count();

		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(new FileOutputStream("formulario.txt", true));

		System.out.println("Escreva sua pergunta: ");
		pergunta = sc.nextLine();
		pw.println("P" + ++numeroDaPergunta + "|" + pergunta);
		pw.close();
		sc.close();
	}

}
