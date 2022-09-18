package br.com.codar;

import java.io.*;
import java.util.Scanner;

public class AddPergunta {

	public void escrevePergunta() throws IOException  {

	String pergunta;
	
	Scanner sc = new Scanner(System.in);
	OutputStream fos = new FileOutputStream("formulario.txt", true);
	PrintWriter pw = new PrintWriter(fos);
	
	System.out.println("Escreva sua pergunta: ");
	pergunta = sc.nextLine();
	pw.println(pergunta);
	pw.close();
	sc.close();
	}
}
