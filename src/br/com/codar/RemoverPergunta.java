package br.com.codar;

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
		List<String> lines = Files.lines(path).collect(Collectors.toList());

		Scanner sc = new Scanner(System.in);
		lines.forEach(System.out::println);

		System.out.println(" \nDigite o numero da pergunta que quer deletar");
		int numeroDaPergunta = sc.nextInt();

		if (numeroDaPergunta <= 4) {
			System.out.println("Voce nao pode deletar essa pergunta.");
			return;
		}

		lines.remove(numeroDaPergunta - 1);
		System.out.println("A Pergunta foi deletada.\n");
		lines.forEach(System.out::println);

		PrintWriter pw = new PrintWriter(new FileOutputStream("formulario.txt"));
		for (int i = 0; i <= lines.size() - 1; i++) {
			pw.println(lines.get(i));
		}

		pw.close();
//		sc.close();
	}

}
