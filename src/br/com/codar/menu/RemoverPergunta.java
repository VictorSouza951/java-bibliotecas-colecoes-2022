package br.com.codar.menu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoverPergunta {
	
	public void removePergunta() throws IOException {
		
		Path path = Paths.get("formulario.txt");
		List<String> linhas = Files.lines(path).collect(Collectors.toList());

		Scanner sc = new Scanner(System.in);
		linhas.forEach(System.out::println);

		System.out.println(" \nDigite o numero da pergunta que quer deletar");
		int numeroDaPergunta = sc.nextInt();

		if (numeroDaPergunta <= 4) {
			System.out.println("Voce nao pode deletar essa pergunta.");
			return;
		}

		linhas.remove(numeroDaPergunta - 1);
		System.out.println("A Pergunta foi deletada.\n");

		PrintWriter pw = new PrintWriter(new FileOutputStream("formulario.txt"));
		for (int i = 0; i <= linhas.size() - 1; i++) {
			pw.println(linhas.get(i));
		}

		pw.close();
//		sc.close();
	}

}
