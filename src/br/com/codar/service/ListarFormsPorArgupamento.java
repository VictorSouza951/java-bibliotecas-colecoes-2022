package br.com.codar.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListarFormsPorArgupamento {

	public void listarPerguntas() throws IOException {
		
		List<List<String>> listaGeral = new ArrayList<>();
		File folder = new File("./formulario-usuario/");
		File[] listaDeArquivos = folder.listFiles();

		for (File arquivo : listaDeArquivos) {
			BufferedReader br = new BufferedReader(new FileReader(folder + "/" + arquivo.getName()));
			List<String> lista = new ArrayList<>();
			String linha = "";
			while (linha != null) {
				linha = br.readLine();
				if (linha != null && !linha.equals("")) {
					lista.add(linha);
				}
			}
			listaGeral.add(lista);
		}

		listaGeral.sort((idade2, idade1) -> {
			return idade1.get(2).compareTo(idade2.get(2));

		});
		System.out.println("Nome, email, idade, telefone: ");
		listaGeral.forEach(System.out::println);
	}
}
