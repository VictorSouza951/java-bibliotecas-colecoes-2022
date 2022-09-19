package br.com.codar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.List;
import java.util.Scanner;

public class ListarForms {

	public void listarPerguntas() {
		File dir = new File("./formulario-usuario/");

		System.out.println("Formularios cadastrados: ");
		File[] arquivos = dir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String nome) {
				return nome.endsWith(".txt");
			}
		});

		for (File arquivo : arquivos) {
			System.out.println(arquivo.getName());
		}
	}
}
