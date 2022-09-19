package br.com.codar.teste;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestePesquisaForm {

		
		public static void listFiles(String path, List<String> filesList)

		{
		    File folder = new File(path);
		    File[] files = folder.listFiles();
		    for (File file : files)
		    { 
		        filesList.add(file.getName());
		    }
		}

		public static void main(String [] args) throws IOException {
		    List<String> filesList = new ArrayList<>();
		    listFiles("./formulario-usuario/", filesList);
		    System.out.println(filesList);
		}
		}
	


