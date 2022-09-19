package br.com.codar.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class TesteLinhas {
	public static void main(String[] args) throws IOException {
//		long numeroDaPergunta = (long) Files.lines(Paths.get("formulario.txt")).count();
//		Path path = Paths.get("formulario.txt");
//		 List<String> lines = Files.lines(path).collect(Collectors.toList());
//		 
//		 lines.forEach(System.out::println);
//		 System.out.println(lines.get(2));
		
		File pasta = new File("./formulario-usuario/");
		int listaDeArquivos = pasta.listFiles().length;

		System.out.println(listaDeArquivos);
		 
	}

}
