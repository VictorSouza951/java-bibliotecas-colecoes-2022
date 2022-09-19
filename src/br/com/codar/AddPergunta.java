package br.com.codar;

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
//		sc.close();

//	Scanner sc = new Scanner(System.in);
//	PrintWriter pw = new PrintWriter(new FileOutputStream("formulario.txt", true));
//	
//	System.out.println("Escreva sua pergunta: ");
//	
//	pw.append(System.lineSeparator()).append(sc.nextLine());
//	pw.close();
//	sc.close();
	}
}
