package br.com.codar.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PesquisarForms {

	public void encontraForm() {

		File folder = new File("./formulario-usuario/");
		File[] listaDeArquivos = folder.listFiles();
		List<String> lista = new ArrayList<>();
		
		for (File arquivo : listaDeArquivos)
	    { 
	        lista.add(arquivo.getName());
	       
	    }
		 lista.forEach(System.out::println);
	}

}
