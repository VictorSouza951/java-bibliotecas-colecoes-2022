package br.com.codar.menu;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class AddPergunta {

	public void escrevePergunta() throws IOException {

		String pergunta;
		long numeroDaPergunta = Files.lines(Paths.get("formulario.txt")).count();

		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(new FileOutputStream("formulario.txt", true));

		System.out.println("Escreva sua pergunta: ");
		pergunta = sc.nextLine();
		pw.println("P" + ++numeroDaPergunta + "|" + pergunta);
		pw.close();
	}
}
